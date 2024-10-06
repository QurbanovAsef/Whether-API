package com.example.androidprojecttest1.recyclerview

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Note::class], version = 3)
abstract class ClassDatabase : RoomDatabase() {
    abstract fun getNoteDao(): NoteDao
}
