package com.store.demo.service;

import com.store.demo.model.Product;
import com.store.demo.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void add(Product product) {
        productRepository.save(product);
    }

    @Override
    public Optional<Product> findByID(Long id) {
        Optional<Product> product = productRepository.findById(id);
        return product;
    }

    @Override
    public void update(Product product) {
        if(product.getId()== null){
            throw new IllegalArgumentException("No id provided");
        }
        productRepository.save(product);
    }

    @Override
    public void delete(Long id) {
        productRepository.deleteById(id);

    }


}
