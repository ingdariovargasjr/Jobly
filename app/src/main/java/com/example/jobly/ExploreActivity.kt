package com.example.jobly

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.jobly.ui.MensajesFragment
import com.example.jobly.ui.PerfilFragment
import com.example.jobly.ui.dashboard.DashboardFragment
import com.example.jobly.ui.home.HomeFragment
import com.example.jobly.ui.notifications.NotificationsFragment
import kotlinx.android.synthetic.main.activity_explore.*

class ExploreActivity : AppCompatActivity() {

    private val agenda = HomeFragment()
    private val favoritos = DashboardFragment()
    private val explora = NotificationsFragment()
    private val mensajes= MensajesFragment()
    private val perfil = PerfilFragment()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_explore)

        replaceFragment(explora)

        nav_view.setOnNavigationItemSelectedListener{
            when(it.itemId) {
                R.id.navigation_agenda -> replaceFragment(agenda)
                R.id.navigation_favoritos -> replaceFragment(favoritos)
                R.id.navigation_explora -> replaceFragment(explora)
                R.id.navigation_mensajes -> replaceFragment(mensajes)
                R.id.navigation_perfil -> replaceFragment(perfil)
            }
            true
        }

        /*val navView: BottomNavigationView = findViewById(R.id.nav_view)

        val navController = findNavController(R.id.nav_host_fragment)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_agenda, R.id.navigation_favoritos, R.id.navigation_explora, R.id.navigation_mensajes, R.id.navigation_perfil
            )
        )
         setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)*/
    }

    private fun replaceFragment(fragment: Fragment){
        if (fragment !=null){
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.nav_explora_frag, fragment)
            transaction.commit()
        }

    }

}