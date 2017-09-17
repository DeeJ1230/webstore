package com.packt.webstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.packt.webstore.domain.Product;
import com.packt.webstore.repository.IProductRepository;

@Service
public class OrderServiceImpl implements IOrderService {

	@Autowired
	private IProductRepository ProductRepository;
	
	@Override
	public void processOrder(String productId, int count) {
		Product productById =ProductRepository.getProductById(productId);
		
		if (productById.getUnitsInStock() < count) {
			throw new IllegalArgumentException("Out of stock");
		}
		
		productById.setUnitsInStock(productById.getUnitsInStock() - count);
	}

}
