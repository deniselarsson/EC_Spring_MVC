package com.grupptre.springmvc.repositories;


import com.grupptre.springmvc.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
