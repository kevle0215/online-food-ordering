package com.kevle0215.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kevle0215.model.IngredientsCategory;

public interface IngredientsCategoryRepository extends JpaRepository<IngredientsCategory, Long>{
    
    List<IngredientsCategory> findByRestaurantId(Long id);
}
