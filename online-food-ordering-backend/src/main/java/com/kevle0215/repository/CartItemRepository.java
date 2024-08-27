package com.kevle0215.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kevle0215.model.CartItem;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {

}
