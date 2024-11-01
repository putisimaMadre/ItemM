package com.item.item.service;

import com.item.item.model.Item;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

public interface ItemService {
    List<Item> getItems();
    Optional<Item> getItem(BigInteger id);
}
