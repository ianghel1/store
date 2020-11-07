package com.store.demo.service;

import com.store.demo.model.Product;

import java.util.Optional;

public interface ProductService {
    //CRUD

    void add(Product product);
    Optional<Product> findByID(Long id);
    void update(Product product);
    void delete(Long id);


}
