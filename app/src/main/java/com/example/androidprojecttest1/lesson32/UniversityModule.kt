//package com.example.androidprojecttest1.lesson32
//
//import dagger.Module
//import dagger.Provides
//import dagger.hilt.InstallIn
//import dagger.hilt.components.SingletonComponent
//
//@Module
//@InstallIn(SingletonComponent::class)
//object UniversityModule {
//
//    @Provides
//    fun provideUniversity(address: Address,teacher: Teacher,student: Student):University{
//        return University(address,student,teacher)
//    }
//    @Provides
//    fun provideAddress():Address{
//        return Address()
//    }
//    @Provides
//    fun provideStudent(address: Address): Student {
//        return Student(address)
//    }
//    fun provideTeacher(address: Address): Teacher {
//        return Teacher(address)
//    }
//}