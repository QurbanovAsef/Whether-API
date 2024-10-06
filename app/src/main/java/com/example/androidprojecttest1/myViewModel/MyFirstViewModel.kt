package com.example.androidprojecttest1.myViewModel

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.room.Room
import com.example.androidprojecttest1.lesson25.AppDatabase
import com.example.androidprojecttest1.lesson25.ClassEntity

class MyFirstViewModel : ViewModel() {
    private var database: AppDatabase? = null

    fun saveStudent(name: String, surname: String) {
        val student = ClassEntity(name = name, surname = surname)
        database?.getStudentDAO()?.addStudentInfo(student)
    }

    fun getAllStudents():LiveData<List<ClassEntity>>? {
        return database?.getStudentDAO()?.getAllStudentInfo()
    }

    fun deleteStudent(student: ClassEntity) {
        database?.getStudentDAO()?.deleteStudentInfo(student)
    }

    fun initDatabase(context: Context) {
        database = Room.databaseBuilder(
            context,
            AppDatabase::class.java,
            "My_Database"
        ).allowMainThreadQueries().build()
    }

    fun destroyDatabase() {
        database?.close()
        database = null
    }
}
