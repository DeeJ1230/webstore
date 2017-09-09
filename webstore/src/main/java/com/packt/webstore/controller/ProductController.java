package com.packt.webstore.controller;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.packt.webstore.domain.Product;
import com.packt.webstore.service.IProductService;

@Controller
@RequestMapping("/products")
public class ProductController {
	@Autowired
	private IProductService productService;

	@RequestMapping
	public String list(Model model) {
		model.addAttribute("products", productService.listAllProducts());
		return "products";
	}

	@RequestMapping("/{category}/{price}")
	public String getProductsByManufacturer(Model model, @PathVariable("category") String category,
			@MatrixVariable(pathVar = "price") Map<String, List<String>> filterparms,
			@RequestParam("manufacturer") String manufacturer) {
		model.addAttribute("products", productService.getProductsByManufaturer(category, filterparms, manufacturer));
		return "products";
	}

	@RequestMapping("/all")
	public String allProducts(Model model) {
		model.addAttribute("products", productService.listAllProducts());
		return "products";
	}

	@RequestMapping("/{category}")
	public String allProductsByCategory(Model model, @PathVariable("category") String category) {
		model.addAttribute("products", productService.listProductsByCategory(category));
		return "products";
	}

	@RequestMapping("/filter/{ByCriteria}")
	public String getProductsByFilter(@MatrixVariable(pathVar = "ByCriteria") Map<String, List<String>> filterparms,
			Model model) {
		model.addAttribute("products", productService.getProductsByFilter(filterparms));
		return "products";
	}

	@RequestMapping("/product")
	public String getProductById(@RequestParam("id") String productId, Model model) {
		model.addAttribute("product", productService.getProductById(productId));
		return "product";
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String getAddNewProductForm(Model model) {
		Product newProduct = new Product();
		model.addAttribute("newProduct", newProduct);
		System.out.println("getAddNewProductForm");
		return "addProduct";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String processAddNewProductForm(@ModelAttribute("newProduct") Product newProduct) {
		productService.addProduct(newProduct);
		System.out.println("processAddNewProductForm");
		return "redirect:/products";
	}
}
