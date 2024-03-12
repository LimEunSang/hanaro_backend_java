package org.example.app.frame;

import org.example.app.data.ItemDto;

import java.util.List;

public interface Dao<K, V> {
    int insert(V v);
    int delete(K k);
    int update(V v);
    ItemDto select(K k);
    List<V> select();
}
