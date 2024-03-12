package com.paymentchain.product.repository;

import com.paymentchain.product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, Long> {
    
}
