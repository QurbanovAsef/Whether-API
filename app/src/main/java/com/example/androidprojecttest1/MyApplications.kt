package com.example.androidprojecttest1

import android.app.Application
import com.example.androidprojecttest1.lesson25.Database
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class MyApplications : Application() {
    override fun onCreate() {
        super.onCreate()

        Database.initDatabase(this)
    }
}
