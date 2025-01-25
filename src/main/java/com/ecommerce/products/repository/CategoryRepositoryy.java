package com.ecommerce.products.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.products.model.Category;

@Repository
public interface CategoryRepositoryy extends JpaRepository<Category, Long> {

}
