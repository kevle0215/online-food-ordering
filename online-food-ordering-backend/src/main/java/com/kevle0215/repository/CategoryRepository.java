package com.kevle0215.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kevle0215.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

    public List<Category> findByRestaurantId(Long id);
    
}
