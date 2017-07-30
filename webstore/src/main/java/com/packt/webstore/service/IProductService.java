package com.packt.webstore.service;

import java.util.List;

import com.packt.webstore.domain.Product;

public interface IProductService {
	List<Product> listAllProducts();
}
