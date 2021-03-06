package com.packt.webstore.repository;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.packt.webstore.domain.Product;

public interface IProductRepository {
	List<Product> getAllProducts();
	Product getProductById(String productId);
	List<Product> getProductsByCategory(String category);
	Set<Product> getProductsByFilter(Map<String,List<String>> filterparms);
	List<Product> getProductsByManufaturer(String category, Map<String,List<String>> filterparms, String manufacturer);
	void addProduct(Product product);
}
