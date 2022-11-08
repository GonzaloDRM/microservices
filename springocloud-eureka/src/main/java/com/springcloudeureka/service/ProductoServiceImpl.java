package com.springcloudeureka.service;

import com.springcloudeureka.entity.Product;
import com.springcloudeureka.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductoServiceImpl implements IProductoService{

    @Autowired
    private ProductoRepository productoRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Product> findAll() {

        return (List<Product>) productoRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Product findById(Long id) {

        return productoRepository.findById(id).orElse(null);
    }
}

