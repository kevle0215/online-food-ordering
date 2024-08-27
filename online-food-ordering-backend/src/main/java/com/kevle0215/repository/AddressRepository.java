package com.kevle0215.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kevle0215.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
