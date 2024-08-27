package com.kevle0215.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kevle0215.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

    public User findByEmail(String username);
    
}
