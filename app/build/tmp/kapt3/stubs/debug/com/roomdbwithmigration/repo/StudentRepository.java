package com.roomdbwithmigration.repo;

import com.roomdbwithmigration.localdb.StudentDao;
import com.roomdbwithmigration.model.Student;
import kotlinx.coroutines.flow.Flow;
import javax.inject.Inject;
import javax.inject.Singleton;

@javax.inject.Singleton()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00a2\u0006\u0002\u0010\tJ\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\f0\u000bJ\u0016\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/roomdbwithmigration/repo/StudentRepository;", "", "studentDao", "Lcom/roomdbwithmigration/localdb/StudentDao;", "(Lcom/roomdbwithmigration/localdb/StudentDao;)V", "deleteStudent", "", "student", "Lcom/roomdbwithmigration/model/Student;", "(Lcom/roomdbwithmigration/model/Student;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllStudents", "Lkotlinx/coroutines/flow/Flow;", "", "insertStudent", "app_debug"})
public final class StudentRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.roomdbwithmigration.localdb.StudentDao studentDao = null;
    
    @javax.inject.Inject()
    public StudentRepository(@org.jetbrains.annotations.NotNull()
    com.roomdbwithmigration.localdb.StudentDao studentDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.roomdbwithmigration.model.Student>> getAllStudents() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertStudent(@org.jetbrains.annotations.NotNull()
    com.roomdbwithmigration.model.Student student, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteStudent(@org.jetbrains.annotations.NotNull()
    com.roomdbwithmigration.model.Student student, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}