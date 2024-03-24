package com.tejs.Async.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tejs.Async.entity.Customer;


public interface CustomerRepository extends JpaRepository<Customer,Integer> {
 
    
} 