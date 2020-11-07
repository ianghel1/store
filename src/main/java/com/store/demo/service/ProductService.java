package com.store.demo.service;

import com.store.demo.model.Product;

public interface ProductService {
    //CRUD

    void add(Product product);
    Product findByID(Long id);
    void update(Product product);
    void delete(Long id);


}
