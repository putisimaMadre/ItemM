package com.item.item.controller;

import com.item.item.model.Item;
import com.item.item.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

@RestController
public class ItemController {
    @Autowired
    private ItemService itemService;

    @GetMapping("items")
    public List<Item> items(){
        return itemService.getItems();
    }

    @GetMapping("items/{id}")
    public Optional<Item> item(@PathVariable BigInteger id){
        return itemService.getItem(id);
    }
}
