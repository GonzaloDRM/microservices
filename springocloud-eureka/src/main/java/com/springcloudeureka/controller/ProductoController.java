package com.springcloudeureka.controller;

import com.springcloudeureka.entity.Product;
import com.springcloudeureka.service.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductoController {

    @Autowired
    private IProductoService iProductoService;

    @GetMapping("/list")
    public List<Product> list(){
        return (List<Product>) iProductoService.findAll();
    }

    @GetMapping("/ver/{id}")
    public Product detalle(@PathVariable Long id){
        return iProductoService.findById(id);
    }

}
