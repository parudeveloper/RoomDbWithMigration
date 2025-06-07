package com.roomdbwithmigration.localdb


import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase
import com.roomdbwithmigration.model.Student

@Database(entities = [Student::class], version = 2, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun studentDao(): StudentDao

    companion object {
        val MIGRATION_1_2 = object : Migration(1, 2) {
            override fun migrate(database: SupportSQLiteDatabase) {
                // Rename old table
                database.execSQL("ALTER TABLE student_table RENAME TO student_table_old")

                // Create new table with marks as DOUBLE
                database.execSQL("""
            CREATE TABLE student_table (
                id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
                name TEXT NOT NULL,
                age INTEGER NOT NULL,
                marks REAL NOT NULL
            )
        """.trimIndent())

                // Copy the data
                database.execSQL("""
            INSERT INTO student_table (id, name, age, marks)
            SELECT id, name, age, marks FROM student_table_old
        """.trimIndent())

                // Drop the old table
                database.execSQL("DROP TABLE student_table_old")
            }
        }

    }
}
