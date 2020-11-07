package com.store.demo.controller;

import com.store.demo.service.ProductService;
import com.store.demo.service.ProductServiceImpl;

public class ProductController {

    private final ProductService productService;
    public ProductController (ProductService productService){
        this.productService = productService;
    }

}
