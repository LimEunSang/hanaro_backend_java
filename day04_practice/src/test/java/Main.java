import org.example.app.data.ItemDto;
import org.example.app.frame.Service;
import org.example.app.service.ItemService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Service<Long, ItemDto> service;
        service = new ItemService();

        // Insert
        ItemDto itemDto = ItemDto.builder().id(04L).name("kail").price(40000L).build();
        service.add(itemDto);

        List<ItemDto> list = null;
        list = service.get();
        for(ItemDto item:list) {
            System.out.println(item);
        }
    }
}