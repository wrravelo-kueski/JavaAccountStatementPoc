package com.javaaccountstatement.poc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.javaaccountstatement.poc.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
