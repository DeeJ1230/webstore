package com.packt.webstore.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.packt.webstore.domain.Product;

public interface IProductService {
	List<Product> listAllProducts();
	List<Product> listProductsByCategory(String category);
	Product getProductById(String productId);
	Set<Product> getProductsByFilter(Map<String,List<String>> filterparms);
	List<Product> getProductsByManufaturer(String category, Map<String,List<String>> filterparms, String manufacturer);
}
