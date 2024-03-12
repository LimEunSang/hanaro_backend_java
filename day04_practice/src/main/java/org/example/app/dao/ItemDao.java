package org.example.app.dao;

import org.example.app.data.ItemDto;
import org.example.app.frame.Dao;

import java.util.ArrayList;
import java.util.List;

public class ItemDao implements Dao<Long, ItemDto> {
    @Override
    public int insert(ItemDto itemDto) {
        System.out.println("Oracle DB: Inserted ... " + itemDto);
        return 0;
    }

    @Override
    public int delete(Long l) {
        System.out.println("Oracle DB: Deleted ... " + l);
        return 0;
    }

    @Override
    public int update(ItemDto itemDto) {
        System.out.println("Oracle DB: Updated ... " + itemDto);
        return 0;
    }

    @Override
    public ItemDto select(Long l) {
        return ItemDto.builder().id(l).name("james").price(20000L).build();
    }

    @Override
    public List<ItemDto> select() {
        List list = new ArrayList<ItemDto>();
        list.add(ItemDto.builder().id(01L).name("james").price(20000L).build());
        list.add(ItemDto.builder().id(02L).name("jade").price(30000L).build());
        list.add(ItemDto.builder().id(03L).name("john").price(40000L).build());
        return list;
    }
}
