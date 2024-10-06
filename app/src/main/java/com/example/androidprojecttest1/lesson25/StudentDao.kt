package com.example.androidprojecttest1.lesson25

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import androidx.room.Upsert

@Dao
interface StudentDao {
    @Insert
    fun addStudentInfo(student: ClassEntity)

    @Update
    fun changeStudentInfo(student: ClassEntity)

    @Upsert
    fun changeOrAddStudentInfo(student: ClassEntity)

    @Delete
    fun deleteStudentInfo(student: ClassEntity)

    @Query("SELECT * FROM class_table")
    fun  getAllStudentInfo():LiveData<List<ClassEntity>>


    @Query("SELECT name FROM class_table")
    fun getStudentNames():List<String>
}