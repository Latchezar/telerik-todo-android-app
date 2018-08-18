package nikolov.com.todoandroidapp.repositories.base;

import android.support.v4.util.Consumer;

import java.util.List;

public interface Repository<T> {
    void getAll(Consumer<List<T>> action);

    void add(T item, Consumer<T> action);
}
