package com.example.jobly

import android.app.Application
import com.parse.Parse

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        Parse.initialize(
            Parse.Configuration.Builder(this)
                .applicationId("BrounieApp") // if defined
                .clientKey("C4suYZKkyRMYPGR7fEae")
                .server("https://yobli.brounieapps.com/parse")
                .build()
        )
    }
}