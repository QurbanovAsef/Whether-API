package com.example.androidprojecttest1.recyclerview

import android.content.Context
import androidx.room.Room

object ClassDatabaseObject {
    private var database: ClassDatabase? = null

    fun initDatabase1(context: Context) {
        if (database == null) {
            database = Room.databaseBuilder(
                context.applicationContext,
                ClassDatabase::class.java,
                "Class_Database"
            )
                .allowMainThreadQueries() // Main thread queries should be avoided in production code
                .build()
        }
    }

    fun getNoteDao(): NoteDao?{
        return database?.getNoteDao()
    }
}
