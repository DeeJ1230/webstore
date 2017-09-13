package com.packt.webstore.exception;

public class ProductNotFoundException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8862859829468945234L;
	
	private String productId;

	public ProductNotFoundException(String productId) {
		this.productId = productId;
	}

	public String getProductId() {
		return productId;
	}
}
