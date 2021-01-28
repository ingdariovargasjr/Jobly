package com.example.jobly

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.facebook.CallbackManager
import com.facebook.FacebookCallback
import com.facebook.FacebookException
import com.facebook.login.LoginManager
import com.facebook.login.LoginResult
import java.util.*

class FirstActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        var btnLogin = findViewById<Button>(R.id.btnLogin)
        var btnNew = findViewById<Button>(R.id.btnNew)

        btnNew.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, NewUserActivity::class.java)
            startActivity(intent)
            finish()
        })

        btnLogin.setOnClickListener {
            // v -> Navigation.findNavController(v).navigate(R.id.mail)
            val intent = Intent(this, LogOptionActivity::class.java)
            startActivity(intent)
            finish()

        }



    }





}
