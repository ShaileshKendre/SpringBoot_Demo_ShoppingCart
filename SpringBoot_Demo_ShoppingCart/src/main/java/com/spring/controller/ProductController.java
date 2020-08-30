package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.spring.model.Category;
import com.spring.model.Product;
import com.spring.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService productService;

	@GetMapping("/products")
	public ResponseEntity<List<Product>> getProducts() {
		List<Product> list = productService.getProductList();
		return new ResponseEntity<List<Product>>(list, HttpStatus.OK);
	}

	@GetMapping("product/{id}")
	public ResponseEntity<Product> getProduct(@PathVariable("id") int id) {
		Product product = productService.getProduct(id);
		return new ResponseEntity<Product>(product, HttpStatus.OK);
	}

	@GetMapping("/categories")
	public ResponseEntity<List<Category>> getCategories() {
		List<Category> list = productService.categories();
		return new ResponseEntity<List<Category>>(list, HttpStatus.OK);
	}
}
