package com.example.e_commerce_application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.e_commerce_application.model.Product;
import com.example.e_commerce_application.repository.ProductRepository;

@Service
public class ProductService {
	private ProductRepository productRepository;

	@Autowired
	public ProductService(ProductRepository productRepository) {
		super();
		this.productRepository=productRepository;
		// TODO Auto-generated constructor stub
	}
	public List<Product>getAllProducts(){
		return productRepository.findAll();
	}
	public Product getProductById(Long id) {
		return productRepository.findById(id).orElseThrow(()->new RuntimeException(" Product not found" ));
	}
	public Product addproduct(Product product) {
		return productRepository .save(product);
	}
	public List<Product>getExpensiveProduct(double price)
	{
		return productRepository.findByPriceGreaterThan(price);
	}
	public void deleteProduct(Long id) {
		productRepository.deleteById(id);
	}
}
