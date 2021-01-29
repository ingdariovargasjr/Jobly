package com.example.jobly

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.jobly.login.*

class NewUserActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_user)


    }


    val mail = mail()
    val password= PasswordFragment()
    val confirm= ConfirmPasswordFragment()
    val about = AboutYouFragment()
    val photo = PhotoFragment()
    val phone = PhoneRegFragment()
    val ID = IDFragment



    private fun replaceFragment(fragment: Fragment){
        if (fragment !=null){
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.nav_graph, fragment)
            transaction.commit()
        }

    }


}