package com.spring.service;

import java.util.List;

import com.spring.model.Category;
import com.spring.model.Product;

public interface ProductService {
   
	List<Product> getProductList();
	
	Product getProduct(int id);
	
	List<Category> categories();


}
