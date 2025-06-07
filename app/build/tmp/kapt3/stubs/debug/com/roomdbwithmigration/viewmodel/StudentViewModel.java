package com.roomdbwithmigration.viewmodel;

import androidx.lifecycle.ViewModel;
import com.roomdbwithmigration.model.Student;
import com.roomdbwithmigration.repo.StudentRepository;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.flow.StateFlow;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bJ\u000e\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bJ\b\u0010\u0011\u001a\u00020\u0012H\u0002R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0013"}, d2 = {"Lcom/roomdbwithmigration/viewmodel/StudentViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/roomdbwithmigration/repo/StudentRepository;", "(Lcom/roomdbwithmigration/repo/StudentRepository;)V", "_students", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/roomdbwithmigration/model/Student;", "students", "Lkotlinx/coroutines/flow/StateFlow;", "getStudents", "()Lkotlinx/coroutines/flow/StateFlow;", "addStudent", "Lkotlinx/coroutines/Job;", "student", "deleteStudent", "getAllStudents", "", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class StudentViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.roomdbwithmigration.repo.StudentRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.roomdbwithmigration.model.Student>> _students = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<com.roomdbwithmigration.model.Student>> students = null;
    
    @javax.inject.Inject()
    public StudentViewModel(@org.jetbrains.annotations.NotNull()
    com.roomdbwithmigration.repo.StudentRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.roomdbwithmigration.model.Student>> getStudents() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job addStudent(@org.jetbrains.annotations.NotNull()
    com.roomdbwithmigration.model.Student student) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job deleteStudent(@org.jetbrains.annotations.NotNull()
    com.roomdbwithmigration.model.Student student) {
        return null;
    }
    
    private final void getAllStudents() {
    }
}