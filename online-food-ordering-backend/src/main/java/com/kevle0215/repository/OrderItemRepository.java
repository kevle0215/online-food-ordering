package com.kevle0215.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kevle0215.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
    
}
