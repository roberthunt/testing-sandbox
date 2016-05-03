package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by rob on 03/05/2016.
 */
@RestController
public class ItemController
{
    private final ItemRepository itemRepository;

    @Autowired
    public ItemController(ItemRepository itemRepository)
    {
        this.itemRepository = itemRepository;
    }

    @RequestMapping
    public List<Item> index()
    {
        return itemRepository.findAll();
    }
}
