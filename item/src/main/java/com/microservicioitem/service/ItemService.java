package com.microservicioitem.service;

import com.microservicioitem.entity.Item;

import java.util.List;

public interface ItemService {

    public List<Item> findAll();
    public Item findById(Long id, Integer quantity);
}
