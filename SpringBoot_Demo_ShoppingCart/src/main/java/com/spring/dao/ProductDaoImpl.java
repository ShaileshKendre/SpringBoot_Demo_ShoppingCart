package com.spring.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.model.Category;
import com.spring.model.Product;

@Repository
public class ProductDaoImpl implements ProductDao {

	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	@Override
	public List<Product> getProductList() {
		@SuppressWarnings("deprecation")
		List<Product> list = sessionFactory.getCurrentSession().createCriteria(Product.class).list();
		return list;
	}

	@Override
	public Product getProduct(int id) {
		Product product = sessionFactory.getCurrentSession().get(Product.class, id);
		return product;
	}

	@SuppressWarnings("deprecation")
	@Override
	public List<Category> categories() {
		@SuppressWarnings("unchecked")
		List<Category> list = sessionFactory.getCurrentSession().createCriteria(Category.class).list();
		return list;
	}

}
