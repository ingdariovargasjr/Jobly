package com.example.jobly

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import com.facebook.CallbackManager
import com.facebook.FacebookCallback
import com.facebook.FacebookException
import com.facebook.login.LoginManager
import com.facebook.login.LoginResult
import java.util.*

class LogOptionActivity : AppCompatActivity() {

    private var callbackManager: CallbackManager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_option)

        var btnMail = findViewById<Button>(R.id.btnMailLog)
        var btnFacebook = findViewById<Button>(R.id.btnFacebookLog)

        btnMail.setOnClickListener {
            val intent = Intent(this, LogMail::class.java)
            startActivity(intent)
            finish()

        }

        btnFacebook.setOnClickListener {
            //Para registrarse en facebook
            callbackManager = CallbackManager.Factory.create()
            LoginManager.getInstance()
                .logInWithReadPermissions(this, Arrays.asList("public_profile", "email"))
            LoginManager.getInstance().registerCallback(callbackManager,
                object : FacebookCallback<LoginResult> {
                    override fun onSuccess(result: LoginResult?) {
                        Log.d("ActivityRegister", "Facebook token: " + result?.accessToken?.token)
                        startActivity(Intent(applicationContext, ExploreActivity::class.java))
                        Toast.makeText(this@LogOptionActivity,"Inicio de sesión con Facebook exitoso.", Toast.LENGTH_LONG).show()
                    }

                    override fun onCancel() {
                        Log.d("ActivityRegister", "Facebook onCancel.")
                        Toast.makeText(this@LogOptionActivity,"Inicio de sesión con Facebook cancelado.", Toast.LENGTH_LONG).show()
                    }

                    override fun onError(error: FacebookException?) {
                        Log.d("ActivityRegister", "Facebook onError.")
                        Toast.makeText(this@LogOptionActivity,"Hubo un error al iniciar sesión.", Toast.LENGTH_LONG).show()
                    }
                })

        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        callbackManager?.onActivityResult(requestCode, resultCode, data)
    }
    }
