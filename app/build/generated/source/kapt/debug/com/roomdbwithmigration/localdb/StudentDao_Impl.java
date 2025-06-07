package com.roomdbwithmigration.localdb;

import androidx.annotation.NonNull;
import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.coroutines.FlowUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteStatement;
import com.roomdbwithmigration.model.Student;
import java.lang.Class;
import java.lang.NullPointerException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.processing.Generated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation", "removal"})
public final class StudentDao_Impl implements StudentDao {
  private final RoomDatabase __db;

  private final EntityInsertAdapter<Student> __insertAdapterOfStudent;

  private final EntityDeleteOrUpdateAdapter<Student> __deleteAdapterOfStudent;

  public StudentDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertAdapterOfStudent = new EntityInsertAdapter<Student>() {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `student_table` (`id`,`name`,`age`,`marks`) VALUES (nullif(?, 0),?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SQLiteStatement statement, @NonNull final Student entity) {
        statement.bindLong(1, entity.getId());
        if (entity.getName() == null) {
          statement.bindNull(2);
        } else {
          statement.bindText(2, entity.getName());
        }
        statement.bindLong(3, entity.getAge());
        statement.bindLong(4, entity.getMarks());
      }
    };
    this.__deleteAdapterOfStudent = new EntityDeleteOrUpdateAdapter<Student>() {
      @Override
      @NonNull
      protected String createQuery() {
        return "DELETE FROM `student_table` WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SQLiteStatement statement, @NonNull final Student entity) {
        statement.bindLong(1, entity.getId());
      }
    };
  }

  @Override
  public Object insertStudent(final Student student, final Continuation<? super Unit> $completion) {
    if (student == null) throw new NullPointerException();
    return DBUtil.performSuspending(__db, false, true, (_connection) -> {
      __insertAdapterOfStudent.insert(_connection, student);
      return Unit.INSTANCE;
    }, $completion);
  }

  @Override
  public Object deleteStudent(final Student student, final Continuation<? super Unit> $completion) {
    if (student == null) throw new NullPointerException();
    return DBUtil.performSuspending(__db, false, true, (_connection) -> {
      __deleteAdapterOfStudent.handle(_connection, student);
      return Unit.INSTANCE;
    }, $completion);
  }

  @Override
  public Flow<List<Student>> getAllStudents() {
    final String _sql = "SELECT * FROM student_table";
    return FlowUtil.createFlow(__db, false, new String[] {"student_table"}, (_connection) -> {
      final SQLiteStatement _stmt = _connection.prepare(_sql);
      try {
        final int _columnIndexOfId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "id");
        final int _columnIndexOfName = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "name");
        final int _columnIndexOfAge = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "age");
        final int _columnIndexOfMarks = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "marks");
        final List<Student> _result = new ArrayList<Student>();
        while (_stmt.step()) {
          final Student _item;
          final int _tmpId;
          _tmpId = (int) (_stmt.getLong(_columnIndexOfId));
          final String _tmpName;
          if (_stmt.isNull(_columnIndexOfName)) {
            _tmpName = null;
          } else {
            _tmpName = _stmt.getText(_columnIndexOfName);
          }
          final int _tmpAge;
          _tmpAge = (int) (_stmt.getLong(_columnIndexOfAge));
          final int _tmpMarks;
          _tmpMarks = (int) (_stmt.getLong(_columnIndexOfMarks));
          _item = new Student(_tmpId,_tmpName,_tmpAge,_tmpMarks);
          _result.add(_item);
        }
        return _result;
      } finally {
        _stmt.close();
      }
    });
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
