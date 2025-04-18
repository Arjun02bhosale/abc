package com.arjun.dbms.repository;

import com.arjun.dbms.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

// ProductRepository.java
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByStockLessThan(int threshold); // For low-stock alerts
}