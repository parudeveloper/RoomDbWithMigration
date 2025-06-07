package com.roomdbwithmigration.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.roomdbwithmigration.model.Student
import com.roomdbwithmigration.repo.StudentRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class StudentViewModel @Inject constructor(
    private val repository: StudentRepository
) : ViewModel() {

    /* val students: StateFlow<List<Student>> = repository.getAllStudents()
         .stateIn(viewModelScope, SharingStarted.WhileSubscribed(), emptyList())*/

    private val _students = MutableStateFlow<List<Student>>(emptyList())
    val students: StateFlow<List<Student>> = _students

    init {
        getAllStudents()
    }

    fun addStudent(student: Student) = viewModelScope.launch {
        repository.insertStudent(student)
    }

    fun deleteStudent(student: Student) = viewModelScope.launch {
        repository.deleteStudent(student)
    }

    private fun getAllStudents() {
        viewModelScope.launch {
            repository.getAllStudents().collect {
                _students.value = it
            }
        }
    }
}