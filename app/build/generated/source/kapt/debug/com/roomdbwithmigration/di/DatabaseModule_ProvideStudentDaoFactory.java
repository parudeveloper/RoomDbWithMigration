package com.roomdbwithmigration.di;

import com.roomdbwithmigration.localdb.AppDatabase;
import com.roomdbwithmigration.localdb.StudentDao;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class DatabaseModule_ProvideStudentDaoFactory implements Factory<StudentDao> {
  private final Provider<AppDatabase> databaseProvider;

  public DatabaseModule_ProvideStudentDaoFactory(Provider<AppDatabase> databaseProvider) {
    this.databaseProvider = databaseProvider;
  }

  @Override
  public StudentDao get() {
    return provideStudentDao(databaseProvider.get());
  }

  public static DatabaseModule_ProvideStudentDaoFactory create(
      Provider<AppDatabase> databaseProvider) {
    return new DatabaseModule_ProvideStudentDaoFactory(databaseProvider);
  }

  public static StudentDao provideStudentDao(AppDatabase database) {
    return Preconditions.checkNotNullFromProvides(DatabaseModule.INSTANCE.provideStudentDao(database));
  }
}
