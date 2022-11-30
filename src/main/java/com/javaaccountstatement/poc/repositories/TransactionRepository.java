package com.javaaccountstatement.poc.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javaaccountstatement.poc.models.Transaction;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Integer> {
  List<Transaction> findByFinanceProductIdAndCreationDateGreaterThanEqualAndCreationDateLessThanEqual(int financeProductId, Date startDate, Date endDate);
}
