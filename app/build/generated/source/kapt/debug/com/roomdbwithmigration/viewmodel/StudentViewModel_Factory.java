package com.roomdbwithmigration.viewmodel;

import com.roomdbwithmigration.repo.StudentRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata
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
public final class StudentViewModel_Factory implements Factory<StudentViewModel> {
  private final Provider<StudentRepository> repositoryProvider;

  public StudentViewModel_Factory(Provider<StudentRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public StudentViewModel get() {
    return newInstance(repositoryProvider.get());
  }

  public static StudentViewModel_Factory create(Provider<StudentRepository> repositoryProvider) {
    return new StudentViewModel_Factory(repositoryProvider);
  }

  public static StudentViewModel newInstance(StudentRepository repository) {
    return new StudentViewModel(repository);
  }
}
