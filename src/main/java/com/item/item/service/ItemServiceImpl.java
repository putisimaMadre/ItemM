package com.item.item.service;

import com.item.item.clientes.ProductoFeingClient;
import com.item.item.model.Item;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ItemServiceImpl implements ItemService{
    private final ProductoFeingClient productoService;

    public ItemServiceImpl(ProductoFeingClient productoService) {
        this.productoService = productoService;
    }

    @Override
    public List<Item> getItems() {
        return productoService.productos().stream().map(p -> new Item(1, p)).collect(Collectors.toList());
    }

    @Override
    public Optional<Item> getItem(BigInteger id) {
        return Optional.of(new Item(1, productoService.producto(id)));
    }
}
