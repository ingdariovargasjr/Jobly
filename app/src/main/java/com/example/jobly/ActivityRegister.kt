package com.example.jobly

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.navigation.Navigation
import com.facebook.CallbackManager
import com.facebook.FacebookCallback
import com.facebook.FacebookException
import com.facebook.login.LoginManager
import com.facebook.login.LoginResult
import java.util.*

class ActivityRegister : AppCompatActivity() {

    private var callbackManager: CallbackManager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        var btnLoginFacebook = findViewById<Button>(R.id.btnLoginFacebook)
        var btnLoginEmail = findViewById<Button>(R.id.btnLoginMail)

        btnLoginFacebook.setOnClickListener(View.OnClickListener {
            callbackManager = CallbackManager.Factory.create()
            LoginManager.getInstance()
                .logInWithReadPermissions(this, Arrays.asList("public_profile", "email"))
            LoginManager.getInstance().registerCallback(callbackManager,
                object : FacebookCallback<LoginResult> {
                    override fun onSuccess(result: LoginResult?) {
                        Log.d("ActivityRegister", "Facebook token: " + result?.accessToken?.token)
                        startActivity(Intent(applicationContext, ExploreActivity::class.java))
                        Toast.makeText(this@ActivityRegister,"Inicio de sesión con Facebook exitoso.", Toast.LENGTH_LONG).show()
                    }

                    override fun onCancel() {
                        Log.d("ActivityRegister", "Facebook onCancel.")
                        Toast.makeText(this@ActivityRegister,"Inicio de sesión con Facebook cancelado.", Toast.LENGTH_LONG).show()
                    }

                    override fun onError(error: FacebookException?) {
                        Log.d("ActivityRegister", "Facebook onError.")
                        Toast.makeText(this@ActivityRegister,"Hubo un error al iniciar sesión.", Toast.LENGTH_LONG).show()
                    }
                })

        })

        btnLoginEmail.setOnClickListener {
               // v -> Navigation.findNavController(v).navigate(R.id.mail)
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()

        }



    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        callbackManager?.onActivityResult(requestCode, resultCode, data)
    }

}