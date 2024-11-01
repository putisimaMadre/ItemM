package com.item.item.clientes;

import com.item.item.model.Producto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.math.BigInteger;
import java.util.List;

@FeignClient(url = "http://localhost:8080", name = "producto-app")
public interface ProductoFeingClient {

    @GetMapping("/productos")
    List<Producto> productos();

    @GetMapping("/{id}")
    Producto producto(@PathVariable BigInteger id);
}
