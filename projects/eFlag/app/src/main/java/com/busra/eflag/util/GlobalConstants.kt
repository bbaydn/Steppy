package com.busra.eflag.util

import com.busra.eflag.R
import com.busra.eflag.data.models.Question

object GlobalConstants {

    fun getQuestions(): ArrayList<Question> {
        val questionList = ArrayList<Question>()
        val quesstionOne = Question(1, "Which Country?", R.drawable.turkey, "Argentina", "Australia", "Armenia", "Turkey", "Ankara",4)
        val quesstionTwo = Question(2, "Which Country?", R.drawable.bulgaria, "Bulgaria", "France", "Ethiopia", "Turkey","Sofia",1)
        val quesstionThree = Question(3, "Which Country?", R.drawable.ethiopia, "Qatar", "Romania", "Ethiopia", "Kiribati", "Addis Ababa",3)
        val quesstionFour = Question(4, "Which Country?", R.drawable.malaysia, "Burkina Faso", "Malaysia", "Russia", "Norway","Kuala Lumpur",2)
        val quesstionFive = Question(5, "Which Country?", R.drawable.monaco, "Peru", "Samoa", "Uzbekistan", "Monaco","This country has no capital city",4)
        questionList.add(quesstionOne)
        questionList.add(quesstionTwo)
        questionList.add(quesstionThree)
        questionList.add(quesstionFour)
        questionList.add(quesstionFive)
        return questionList
    }
}