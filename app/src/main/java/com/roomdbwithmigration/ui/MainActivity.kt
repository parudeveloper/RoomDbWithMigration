package com.roomdbwithmigration.ui

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.roomdbwithmigration.R
import com.roomdbwithmigration.adapter.StudentAdapter
import com.roomdbwithmigration.databinding.ActivityMainBinding
import com.roomdbwithmigration.model.Student
import com.roomdbwithmigration.viewmodel.StudentViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val viewModel: StudentViewModel by viewModels()
    lateinit var binding : ActivityMainBinding

    val TAG ="MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val adapter = StudentAdapter()
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = adapter

        lifecycleScope.launch {
            viewModel.students.collectLatest {
                Log.i(TAG, "onCreate: $it")
                adapter.submitList(it)
            }
        }

        binding.btnAdd.setOnClickListener {
            val student = Student(name = "John", age = 21, marks = 90)
            viewModel.addStudent(student)
            Toast.makeText(this,"Data Added",Toast.LENGTH_SHORT).show()
        }
    }
}