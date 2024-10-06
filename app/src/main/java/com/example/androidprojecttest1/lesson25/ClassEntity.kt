package com.example.androidprojecttest1.lesson25

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "class_table") // Bu adın uyğun olduğundan əmin olun
data class ClassEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val name: String,
    val surname: String
)

