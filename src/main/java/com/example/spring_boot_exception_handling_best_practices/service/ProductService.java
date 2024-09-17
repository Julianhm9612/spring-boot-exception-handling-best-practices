package com.example.spring_boot_exception_handling_best_practices.service;

import org.springframework.stereotype.Service;

import com.example.spring_boot_exception_handling_best_practices.Product;
import com.example.spring_boot_exception_handling_best_practices.ProductNotFoundException;

@Service
public class ProductService {

    public Product getProductById(Long productId) {
        // Simulate product retrieval logic
        Product product = getProductFromDatabase(productId);
        
        if (product == null) {
            throw new ProductNotFoundException(productId);
        }
        
        return product;
    }

    // Simulated method to fetch a product from a database
    private Product getProductFromDatabase(Long productId) {
        // Implement your database logic here
        // Return null if the product is not found
        return null;
    }
}
