package com.packt.webstore.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.packt.webstore.domain.Product;
import com.packt.webstore.repository.IProductRepository;

@Service
public class ProductService implements IProductService {

	@Autowired
	private IProductRepository productRepository;
	
	@Override
	public List<Product> getProductsByManufaturer(String category, Map<String, List<String>> filterparms,
			String manufacturer) {
		return productRepository.getProductsByManufaturer(category, filterparms, manufacturer);
	}

	@Override
	public List<Product> listAllProducts() {
		return productRepository.getAllProducts();
	}

	@Override
	public Product getProductById(String productId) {
		return productRepository.getProductById(productId);
	}

	@Override
	public List<Product> listProductsByCategory(String category) {
		return productRepository.getProductsByCategory(category);
	}

	@Override
	public Set<Product> getProductsByFilter(Map<String, List<String>> filterparms) {
		return productRepository.getProductsByFilter(filterparms);
	}
	
	@Override
	public void addProduct(Product product) {
		productRepository.addProduct(product);
	}
}
