package com.springcloudeureka.service;

import com.springcloudeureka.entity.Product;

public interface IProductoService {

    public Iterable<Product> findAll();
    public Product findById(Long id);


}
