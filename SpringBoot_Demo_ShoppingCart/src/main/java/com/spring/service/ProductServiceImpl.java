package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.dao.ProductDao;
import com.spring.model.Category;
import com.spring.model.Product;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao productDao;

	@Override
	public List<Product> getProductList() {
		List<Product> list = productDao.getProductList();
		return list;
	}

	@Override
	public Product getProduct(int id) {
		Product product = productDao.getProduct(id);
		return product;
	}

	@Override
	public List<Category> categories() {
		List<Category> list = productDao.categories();
		return list;
	}

}
