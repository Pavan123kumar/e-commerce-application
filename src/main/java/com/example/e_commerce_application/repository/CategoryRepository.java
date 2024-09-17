package com.example.e_commerce_application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.e_commerce_application.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
