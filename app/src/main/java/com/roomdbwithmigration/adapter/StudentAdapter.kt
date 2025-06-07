package com.roomdbwithmigration.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.text.bold
import androidx.core.text.buildSpannedString
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.roomdbwithmigration.databinding.ItemStudentBinding
import com.roomdbwithmigration.model.Student

class StudentAdapter : ListAdapter<Student, StudentAdapter.StudentViewHolder>(DiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentViewHolder {
        val binding = ItemStudentBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return StudentViewHolder(binding)
    }

    override fun onBindViewHolder(holder: StudentViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    class StudentViewHolder(private val binding: ItemStudentBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(student: Student) {
            binding.textName.text = "Name :${student.name}"
            binding.textAge.text = buildSpannedString {
                append("Age: ")
                bold { append("${student.age}") }
            }
            binding.textMarks.text = buildSpannedString {
                append("Marks: ")
                bold { append("${student.marks}") }
            }
        }
    }

    class DiffCallback : DiffUtil.ItemCallback<Student>() {
        override fun areItemsTheSame(old: Student, new: Student) = old.id == new.id
        override fun areContentsTheSame(old: Student, new: Student) = old == new
    }
}