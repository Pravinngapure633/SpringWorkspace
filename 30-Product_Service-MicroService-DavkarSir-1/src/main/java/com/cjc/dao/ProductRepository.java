package com.cjc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.entity.Product;
@Repository
public interface ProductRepository  extends JpaRepository<Product ,Integer >{

}
