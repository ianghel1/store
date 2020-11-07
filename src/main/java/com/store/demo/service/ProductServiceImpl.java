package com.store.demo.service;

import com.store.demo.model.Product;
import com.store.demo.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    @Override
    public void add(Product product) {

    }

    @Override
    public Product findByID(Long id) {
        return null;
    }

    @Override
    public void update(Product product) {

    }

    @Override
    public void delete(Long id) {

    }


}
