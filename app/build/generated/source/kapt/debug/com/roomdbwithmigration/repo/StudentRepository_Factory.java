package com.roomdbwithmigration.repo;

import com.roomdbwithmigration.localdb.StudentDao;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast",
    "deprecation",
    "nullness:initialization.field.uninitialized"
})
public final class StudentRepository_Factory implements Factory<StudentRepository> {
  private final Provider<StudentDao> studentDaoProvider;

  public StudentRepository_Factory(Provider<StudentDao> studentDaoProvider) {
    this.studentDaoProvider = studentDaoProvider;
  }

  @Override
  public StudentRepository get() {
    return newInstance(studentDaoProvider.get());
  }

  public static StudentRepository_Factory create(Provider<StudentDao> studentDaoProvider) {
    return new StudentRepository_Factory(studentDaoProvider);
  }

  public static StudentRepository newInstance(StudentDao studentDao) {
    return new StudentRepository(studentDao);
  }
}
