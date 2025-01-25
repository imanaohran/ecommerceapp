package com.ecommerce.products.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ecommerce.products.model.Product;
import com.ecommerce.products.repository.ProductRepository;

@Service
public class ProductService {

    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public List<Product> getProductsById(Long categoryId) {
        return productRepository.findByCategoryId(categoryId);
    }
}
