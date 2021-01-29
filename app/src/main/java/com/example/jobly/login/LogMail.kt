package com.example.jobly.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.jobly.ExploreActivity
import com.example.jobly.FirstActivity
import com.example.jobly.R

class LogMail : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_mail)

        val button= findViewById<Button>(R.id.action_login)

        button.setOnClickListener{
            val intent = Intent(this, ExploreActivity::class.java)
            startActivity(intent)
            finish()
        }


    }

    override fun onClick(v: View?) {
        val intent = Intent(this, ExploreActivity::class.java)
        startActivity(intent)
        finish()
    }

}