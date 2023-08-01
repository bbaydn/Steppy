package com.busra.eflag.ui.fragments

import android.annotation.SuppressLint
import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.os.Handler
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.core.os.postDelayed
import androidx.navigation.fragment.findNavController
import com.busra.eflag.R
import com.busra.eflag.data.models.Question
import com.busra.eflag.databinding.FragmentQuizBinding
import com.busra.eflag.util.GlobalConstants
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.collections.ArrayList
import kotlin.concurrent.thread

class QuizFragment : Fragment(), View.OnClickListener {

    private lateinit var binding : FragmentQuizBinding
    private lateinit var hintMessage : String
    private var mCurrentPosition: Int = 1
    private var mQuestionList: ArrayList<Question>? = null
    private var mSelectedOption: Int = 0
    private var mCorrectAnswers: Int = 0
    private var mWrongCount: Int = 0

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentQuizBinding.inflate(layoutInflater, container, false)

        mQuestionList = GlobalConstants.getQuestions()

        setQuestion()
        binding.tvQuestionCount?.text = (mCurrentPosition).toString()

        binding.tvFirst.setOnClickListener(this)
        binding.tvSecond.setOnClickListener(this)
        binding.tvThird.setOnClickListener(this)
        binding.tvForth.setOnClickListener(this)
        binding.buttonSubmit.setOnClickListener(this)
        binding.buttonHint.setOnClickListener(this)


        return binding.root
    }

    private fun setQuestion() {
        val question: Question? = if(mCurrentPosition <= mQuestionList!!.size) {
            mQuestionList?.get(mCurrentPosition - 1)
        } else {
            null
        }

        if (question != null) {
            binding.tvQuestionCount?.text = (mCurrentPosition).toString()
            binding.tvQuestion.text = question.question
            binding.imageView2.setImageResource(question.image)
            binding.tvFirst.text = question.firstOption
            binding.tvSecond.text = question.secondOption
            binding.tvThird.text = question.thirdOption
            binding.tvForth.text = question.forthOption
            hintMessage = question.hint
            Log.e("serQuestion hint button", hintMessage)
        } else {
            findNavController().navigate(R.id.action_quizFragment_to_homeFragment)
        }

        defaultOptionsView()

        if (mSelectedOption == 0) {
            binding.buttonSubmit.text = "SUBMIT"
        } else if (mSelectedOption != 0 && mCurrentPosition == mQuestionList!!.size) {
            binding.buttonSubmit.text = "FINISH"
        } else {
            binding.buttonSubmit.text = "GO TO NEXT QUESTION"
        }

    }

    private fun defaultOptionsView() {
        val options = ArrayList<TextView>()
        options.add(0, binding.tvFirst)
        options.add(1, binding.tvSecond)
        options.add(2, binding.tvThird)
        options.add(3, binding.tvForth)

        for (option in options) {
            option.setTextColor(Color.parseColor("#3F51B5"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(requireContext(), R.drawable.button_bg)
        }

    }

    private fun selectedOptionsView(tv: TextView, selected: Int) {
        defaultOptionsView()
        mSelectedOption = selected
        tv.setTextColor(Color.parseColor("#3F51B5"))
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(requireContext(), R.drawable.selected_button_bg)
    }

    private fun answer(answer: Int, drawableView: Int) {
        when(answer) {
            1 -> {
                binding.tvFirst.background = ContextCompat.getDrawable(requireContext(), drawableView)
            }
            2 -> {
                binding.tvSecond.background = ContextCompat.getDrawable(requireContext(), drawableView)
            }
            3 -> {
                binding.tvThird.background = ContextCompat.getDrawable(requireContext(), drawableView)
            }
            4 -> {
                binding.tvForth.background = ContextCompat.getDrawable(requireContext(), drawableView)
            }
        }
    }

    override fun onClick(p0: View?) {
       when(p0?.id) {
           R.id.tvFirst -> {
               selectedOptionsView(binding.tvFirst,1)
           }

           R.id.tvSecond -> {
               selectedOptionsView(binding.tvSecond,2)
           }
           R.id.tvThird -> {
               selectedOptionsView(binding.tvThird,3)
           }
           R.id.tvForth -> {
               selectedOptionsView(binding.tvForth,4)
           }
           R.id.buttonSubmit -> {
                if (mSelectedOption == 0) {
                    mCurrentPosition ++

                    when {
                        mCurrentPosition <= mQuestionList!!.size -> {
              //              binding.tvQuestionCount?.text = (mCurrentPosition + 1).toString()
                            setQuestion()
                        } else -> {
                            Toast.makeText(requireContext(), "You have succesfully completed the quiz", Toast.LENGTH_SHORT).show()
                            findNavController().navigate(R.id.action_quizFragment_to_resultFragment)


                        }
                    }
                } else {
                    val question = mQuestionList?.get(mCurrentPosition - 1)
                    if (question!!.correctOption != mSelectedOption) {
                        answer(mSelectedOption, R.drawable.wrong_answer_bg)
                        mWrongCount ++

                    } else {
                        mCorrectAnswers ++
                    }
                    answer(question.correctOption, R.drawable.correct_answer_bg)

                    if(mWrongCount == 1) {
                        binding.ivFirstTry.visibility = View.GONE
                    } else if(mWrongCount == 2) {
                        binding.ivFirstTry.visibility = View.GONE
                        binding.ivSecondTry.visibility = View.GONE
                    } else if( mWrongCount == 3) {
                        binding.ivFirstTry.visibility = View.GONE
                        binding.ivSecondTry.visibility = View.GONE
                        binding.ivThirdTry.visibility = View.GONE
                        val handler = Handler()
                        handler.postDelayed({findNavController().navigate(R.id.action_quizFragment_to_resultFragment)},1000)
                    }

                    if (mCurrentPosition == mQuestionList!!.size) {
                        binding.buttonSubmit.text = "FINISH"
                    } else {
                        binding.buttonSubmit.text = "GO TO NEXT QUESTION"
                    }
                    mSelectedOption = 0
                }
           }

           R.id.button_hint -> {
               binding.tvHint?.text = hintMessage
               binding.imageBubble?.visibility = View.VISIBLE
               binding.tvHint?.visibility = View.VISIBLE
               val handler = Handler()
               handler.postDelayed({
                   binding.imageBubble?.visibility = View.GONE // Yazıyı kaybolmuş yap
                   binding.tvHint?.visibility = View.GONE
               }, 2000)

           }
       }
    }
}