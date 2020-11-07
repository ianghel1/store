package com.store.demo.controller;

import com.store.demo.model.Product;
import com.store.demo.service.ProductService;
import com.store.demo.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
@RequestMapping("product")
@RestController
public class ProductController {

    private final ProductService productService;


    public ProductController (ProductService productService){
        this.productService = productService;
    }

    @PostMapping
    public ResponseEntity<Product> add(@RequestBody Product product){

        productService.add(product);
        return ResponseEntity.noContent().build();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Product> findById(@PathVariable Long id){
        Optional<Product> queriedProduct = productService.findByID(id);
       if(queriedProduct.isPresent()) {
           return ResponseEntity.ok(queriedProduct.get());
       }else{
           return ResponseEntity.notFound().build();
       }
    }

}
