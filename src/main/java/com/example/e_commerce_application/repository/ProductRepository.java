package com.example.e_commerce_application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import com.example.e_commerce_application.model.Product;

@Repository
public interface  ProductRepository extends JpaRepository<Product, Long> {

	List<Product>findByPriceGreaterThan(double price);
	
}
