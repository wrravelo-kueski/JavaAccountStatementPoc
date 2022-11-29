package com.javaaccountstatement.poc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javaaccountstatement.poc.models.FinanceProduct;

@Repository
public interface FinanceProductRepository extends JpaRepository<FinanceProduct, Integer> {
}
