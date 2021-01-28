package com.example.jobly

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.facebook.AccessToken
import com.facebook.GraphRequest
import com.facebook.HttpMethod
import com.facebook.login.LoginManager
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

/*
        addFragment(ProfileFragment.newInstance())
        bottomNavigation.show(4)
        bottomNavigation.add(MeowBottomNavigation.Model(0, R.drawable.agenda))
        bottomNavigation.add(MeowBottomNavigation.Model(1, R.drawable.favoritos))
        bottomNavigation.add(MeowBottomNavigation.Model(2, R.drawable.search))
        bottomNavigation.add(MeowBottomNavigation.Model(3, R.drawable.mensajes))
        bottomNavigation.add(MeowBottomNavigation.Model(4, R.drawable.perfil))

        bottomNavigation.setOnClickMenuListener {
            when(it.id){
                0 ->{
                    replaceFragment(AgendaFragment.newInstance())
                }
                1 ->{
                    replaceFragment(FavoritesFragment.newInstance())
                }
                2 ->{
                    replaceFragment(ExploreFragment.newInstance())
                }
                3 ->{
                    replaceFragment(MessagesFragment.newInstance())
                }
                4 ->{
                    replaceFragment(ProfileFragment.newInstance())
                }
                else ->{
                    replaceFragment(ProfileFragment.newInstance())
                }

            }
        }

    }*/

        /*
    private fun replaceFragment(fragment:Fragment){
        val fragmentTransition = supportFragmentManager.beginTransaction()
        fragmentTransition.replace(R.id.fragmanetContainer, fragment).addToBackStack(Fragment::class.java.simpleName).commit()
    }

    private fun addFragment(fragment:Fragment){
        val fragmentTransition = supportFragmentManager.beginTransaction()
        fragmentTransition.add(R.id.fragmanetContainer, fragment).addToBackStack(Fragment::class.java.simpleName).commit()
    }*/
    }
}