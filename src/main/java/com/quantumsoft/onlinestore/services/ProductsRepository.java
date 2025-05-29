package com.quantumsoft.onlinestore.services;

import com.quantumsoft.onlinestore.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<Product, Integer> {
}
