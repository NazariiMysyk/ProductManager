package com.nazar.ProductManager.repository;

import com.nazar.ProductManager.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByCategoryId(Long Id);
}
