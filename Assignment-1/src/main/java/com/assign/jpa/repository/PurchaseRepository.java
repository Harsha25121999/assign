package com.assign.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assign.jpa.entity.Purchase;

public interface PurchaseRepository extends JpaRepository<Purchase,Integer> {

}
