package com.roomdbwithmigration.di

import android.content.Context
import androidx.room.Room
import com.roomdbwithmigration.localdb.AppDatabase
import com.roomdbwithmigration.localdb.StudentDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext context: Context): AppDatabase {
        return Room.databaseBuilder(
            context,
            AppDatabase::class.java,
            "student_db"
        ).addMigrations(AppDatabase.MIGRATION_1_2).build()
    }

    @Provides
    fun provideStudentDao(database: AppDatabase): StudentDao {
        return database.studentDao()
    }
}