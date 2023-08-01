package com.busra.stepy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar
import com.busra.stepy.databinding.ActivityProfileBinding
import com.google.firebase.auth.FirebaseAuth

class ProfileActivity : AppCompatActivity() {
    //viewBinding
    private lateinit var binding: ActivityProfileBinding

    //ActionBar
    private lateinit var actionBar: ActionBar

    //FirebaseAut
    private lateinit var firebaseAuth: FirebaseAuth


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        //configure actionbar
        actionBar = supportActionBar!!
        actionBar.title = "Profile"


        //firebaseAuth
        firebaseAuth = FirebaseAuth.getInstance()
        checkUser()


        //logout
        binding.logoutButton.setOnClickListener {
            firebaseAuth.signOut()
            checkUser()
        }

        //binding - home button
        binding.home.setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
        }


    }

    private fun checkUser() {
        //check user is logged in or not
        val firebaseUser = firebaseAuth.currentUser
        if (firebaseUser != null) {
            //user not null, user is logged in, get user info
            val email = firebaseUser.email
            binding.emailTv.text = email

        } else {
            //user is null, user is not logged in
            startActivity(Intent(this, LoginActivity::class.java))
            finish()

        }
    }
}