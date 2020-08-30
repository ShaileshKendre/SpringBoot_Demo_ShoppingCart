package com.spring.dao;

import java.util.List;

import com.spring.model.Category;
import com.spring.model.Product;

public interface ProductDao {

	List<Product> getProductList();

	Product getProduct(int id);

	List<Category> categories();
}
