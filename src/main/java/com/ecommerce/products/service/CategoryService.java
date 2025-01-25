package com.ecommerce.products.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ecommerce.products.model.Category;
import com.ecommerce.products.repository.CategoryRepositoryy;

@Service
public class CategoryService {

    private final CategoryRepositoryy categoryRepository;

    public CategoryService(CategoryRepositoryy categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }
}
