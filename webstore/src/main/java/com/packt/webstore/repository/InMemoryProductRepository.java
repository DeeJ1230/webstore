package com.packt.webstore.repository;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Repository;

import com.packt.webstore.domain.Product;

@Repository
public class InMemoryProductRepository implements IProductRepository {
	private List<Product> listOfProducts = new ArrayList<>();

	public InMemoryProductRepository() {
		Product iphone = new Product("P1234", "iPhone 5s", new BigDecimal(500));
		iphone.setDescription("Apple iPhone 5s smartphone with 4.00-inch 640x1136 display and 8-megapixel rear camera");
		iphone.setCategory("Smart Phone");
		iphone.setManufacturer("Apple");
		iphone.setUnitsInStock(800);

		Product laptop_dell = new Product("P1235", "Dell Inspiron", new BigDecimal(700));
		laptop_dell.setDescription("Dell Inspiron 14-inch Laptop (Black) with 3rd Generation Intel Core processors");
		laptop_dell.setCategory("Laptop");
		laptop_dell.setManufacturer("Dell");
		laptop_dell.setUnitsInStock(500);

		Product tablet_Nexus = new Product("P1236", "Nexus 7", new BigDecimal(300));
		tablet_Nexus.setDescription(
				"Google Nexus 7 is the lightest 7 inch tablet With a quad-core Qualcomm SnapdragonTM S4 Pro processor");
		tablet_Nexus.setCategory("Tablet");
		tablet_Nexus.setManufacturer("Google");
		tablet_Nexus.setUnitsInStock(1000);

		listOfProducts.add(iphone);
		listOfProducts.add(laptop_dell);
		listOfProducts.add(tablet_Nexus);
	}

	@Override
	public List<Product> getProductsByManufaturer(String category, Map<String, List<String>> filterparms,
			String manufacturer) {
		List<Product> result = new ArrayList<>();
		
		for (Product product : getProductsByCategory(category)) {
			if (product.getManufacturer().equalsIgnoreCase(manufacturer)) {
				if (product.getUnitPrice().compareTo(new BigDecimal(filterparms.get("low").get(0))) == 1 & product.getUnitPrice().compareTo(new BigDecimal(filterparms.get("high").get(0))) == -1)
					result.add(product);
			}
		}
		
		return result;
	}

	@Override
	public Set<Product> getProductsByFilter(Map<String, List<String>> filterparms) {
		Set<Product> productsByBrand = new HashSet<>();
		Set<Product> productsByCategory = new HashSet<>();

		Set<String> criterias = filterparms.keySet();

		if (criterias.contains("brand")) {
			for (String brand : filterparms.get("brand")) {
				for (Product product : listOfProducts) {
					if (product.getManufacturer().equalsIgnoreCase(brand))
						productsByBrand.add(product);
				}
			}
		}

		if (criterias.contains("category")) {
			for (String category : filterparms.get("category")) {
				productsByCategory.addAll(getProductsByCategory(category));
			}
		}

		productsByBrand.retainAll(productsByCategory);

		return productsByBrand;
	}

	@Override
	public List<Product> getProductsByCategory(String category) {
		List<Product> listByCategory = new ArrayList<>();
		for (Product product : listOfProducts) {
			if (product.getCategory().equalsIgnoreCase(category))
				listByCategory.add(product);
		}
		return listByCategory;
	}

	@Override
	public Product getProductById(String productId) {
		for (Product product : listOfProducts) {
			if (product.getProductId().equals(productId))
				return product;
		}
		throw new IllegalArgumentException("No products found with the Id: " + productId);
	}

	@Override
	public List<Product> getAllProducts() {
		return listOfProducts;
	}
}
