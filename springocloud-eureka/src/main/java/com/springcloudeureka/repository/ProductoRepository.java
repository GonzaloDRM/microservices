package com.springcloudeureka.repository;

import com.springcloudeureka.entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends CrudRepository<Product, Long> {
}
