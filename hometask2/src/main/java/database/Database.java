package database;

import java.util.List;

public interface Database<K, V> {
    void add(K key, V value);

    List<V> select(K key);
}
