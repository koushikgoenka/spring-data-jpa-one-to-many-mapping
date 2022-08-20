package com.example.springdatajpamapping.controller;

import com.example.springdatajpamapping.entity.Product;
import com.example.springdatajpamapping.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/getAllProducts")
    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product){

        return productRepository.save(product);
    }

    @GetMapping("/getProductById/{productId}")
    public Optional<Product> getProductById(@PathVariable Integer productId){
        return productRepository.findById(productId);
    }
}
