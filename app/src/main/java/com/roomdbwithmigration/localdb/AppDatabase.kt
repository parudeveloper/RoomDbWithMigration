package com.roomdbwithmigration.localdb


import androidx.room.Database
import androidx.room.RoomDatabase
import com.roomdbwithmigration.model.Student

@Database(entities = [Student::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun studentDao(): StudentDao
}