package com.example.e_commerce_application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.e_commerce_application.model.Product;
import com.example.e_commerce_application.service.ProductService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api/products")
public class ProductController {
	
	private ProductService productService;
	@Autowired
	public ProductController(ProductService productService) {
		super();
		// TODO Auto-generated constructor stub
		this.productService=productService;
	}
	@GetMapping
	public List<Product>getAllProducts(){
		return productService.getAllProducts();
	}
	@PostMapping
	public Product addProduct(@RequestBody Product product) {
		//TODO: process POST request
		
		return productService.addproduct(product);
	}
	@GetMapping("/{id}")
	public Product getProductById(@PathVariable Long id) {
		return productService.getProductById(id);
	}
	@GetMapping("/expensive")
	public List<Product>getExpensiveProduct(@RequestParam double price){
		return productService.getExpensiveProduct(price);
	}
	@DeleteMapping("{id}")
		public void deleteProduct(@PathVariable Long id) {
		productService.deleteProduct(id);
	}
	

}