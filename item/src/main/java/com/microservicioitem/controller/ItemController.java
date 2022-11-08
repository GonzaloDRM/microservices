package com.microservicioitem.controller;

import com.microservicioitem.entity.Item;
import com.microservicioitem.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemController {

    @Autowired
    private ItemService itemService;

    @GetMapping("/listar")
    public List<Item> listar(){
        return itemService.findAll();
    }

    @GetMapping("ver/{id}/quantity/{quantity}")
    public Item detalle(@PathVariable Long id, @PathVariable Integer quantity){
        return itemService.findById(id, quantity);
    }

}
