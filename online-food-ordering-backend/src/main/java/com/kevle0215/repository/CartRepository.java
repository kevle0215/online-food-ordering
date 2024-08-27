package com.kevle0215.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kevle0215.model.Cart;

public interface CartRepository extends JpaRepository<Cart, Long> {

    public Cart findByCustomerId(Long userId);
}
