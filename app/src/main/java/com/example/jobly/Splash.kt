package com.example.jobly

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class Splash : AppCompatActivity() {

    lateinit var handler: Handler

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        handler = Handler()
        handler.postDelayed({
            val intent = Intent(this, FirstActivity::class.java)
            //val intent = Intent(this, ExploreActivity::class.java)
            //val intent = Intent(this, NewUserActivity::class.java)
            startActivity(intent)
            finish()
        }, 2000)

    }
}