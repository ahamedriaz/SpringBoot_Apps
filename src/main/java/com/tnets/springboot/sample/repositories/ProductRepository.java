package com.tnets.springboot.sample.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tnets.springboot.sample.entities.Product;
import com.tnets.springboot.sample.entities.Role;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
	//public Product findByName(String name);

}