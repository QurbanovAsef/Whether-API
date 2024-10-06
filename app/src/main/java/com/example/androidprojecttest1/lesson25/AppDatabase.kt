package com.example.androidprojecttest1.lesson25

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(

    entities =[ ClassEntity::class],
    version = 1
)

abstract class AppDatabase :RoomDatabase(){
    abstract fun getStudentDAO():StudentDao

}
