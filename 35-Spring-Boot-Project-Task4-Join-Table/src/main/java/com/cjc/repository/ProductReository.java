package com.cjc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.model.Product;
@Repository
public interface ProductReository extends JpaRepository<Product, Integer> {

}
