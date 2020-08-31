package com.spring.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.model.Category;
import com.spring.model.Image;
import com.spring.model.Product;


@Repository
public class ProductDaoImpl implements ProductDao {

	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("deprecation")
	@Override
	public List<Product> getProductList() {
		@SuppressWarnings("unchecked")
		List<Product> list = sessionFactory.getCurrentSession().createCriteria(Product.class).list();
		return list;
	}

	@Override
	public Product getProduct(int id) {
		Product product = sessionFactory.getCurrentSession().get(Product.class, id);
		return product;
	}

	@Override
	public List<Category> categories() {

		@SuppressWarnings("unchecked")
		List<Category> list = sessionFactory.getCurrentSession().createQuery("from Category").list();
		return list;
	}

	@SuppressWarnings("deprecation")
	@Override
	public List<Image> allImages() {
		@SuppressWarnings("unchecked")
		List<Image> list = sessionFactory.getCurrentSession().createCriteria(Image.class).list();
		return list;
	}

}
