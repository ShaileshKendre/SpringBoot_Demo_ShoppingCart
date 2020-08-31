package com.spring.service;

import java.util.List;

import com.spring.model.Category;
import com.spring.model.Image;
import com.spring.model.Product;

public interface ProductService {

	List<com.spring.model.Product> getProductList();

	Product getProduct(int id);

	List<Category> categories();

	List<Image> allImages();
}
