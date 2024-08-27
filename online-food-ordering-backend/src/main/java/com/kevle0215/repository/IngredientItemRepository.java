package com.kevle0215.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kevle0215.model.IngredientsItem;

public interface IngredientItemRepository extends JpaRepository<IngredientsItem, Long>{
    
    List<IngredientsItem> findByRestaurantId(Long id);
}
