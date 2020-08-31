package com.spring.dao;

import java.util.List;

import com.spring.model.Category;
import com.spring.model.Image;
import com.spring.model.Product;

public interface ProductDao {

	List<com.spring.model.Product> getProductList();

	Product getProduct(int id);

	List<Category> categories();

	List<Image> allImages();
}
