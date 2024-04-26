package com.bigOne.stayfitadmin.ui.Login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.bigOne.stayfitadmin.MainActivity
import com.bigOne.stayfitadmin.R
import com.bigOne.stayfitadmin.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()

    }

    fun init() {
        binding.apply {
            login.setOnClickListener {
                if (username.text.toString() == "admin" && password.text.toString() == "123") {
                    val intent = Intent(this@LoginActivity, MainActivity::class.java)
                    startActivity(intent)
                }

                else {

                    Toast.makeText(this@LoginActivity, "Invalid username or password", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

}