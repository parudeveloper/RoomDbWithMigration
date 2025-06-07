package com.roomdbwithmigration.repo

import com.roomdbwithmigration.localdb.StudentDao
import com.roomdbwithmigration.model.Student
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class StudentRepository @Inject constructor(
    private val studentDao: StudentDao
) {
    fun getAllStudents(): Flow<List<Student>> = studentDao.getAllStudents()

    suspend fun insertStudent(student: Student) {
        studentDao.insertStudent(student)
    }

    suspend fun deleteStudent(student: Student) {
        studentDao.deleteStudent(student)
    }
}