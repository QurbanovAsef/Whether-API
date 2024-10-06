package com.example.androidprojecttest1.lesson25

import android.content.Context
import androidx.room.Room

object Database {

    private var database: AppDatabase? = null

    fun initDatabase(context: Context) {
        if (database == null) {
            database = Room.databaseBuilder(
                context.applicationContext,
                AppDatabase::class.java,
                "My_Database" // Verilənlər bazası adı
            ).allowMainThreadQueries().build()
        }
    }

    fun getStudentDAO(): StudentDao? {
        return database?.getStudentDAO()
    }
}
//