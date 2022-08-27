package org.simplilearn.controller;

import java.util.List;

import org.simplilearn.entities.Product;
import org.simplilearn.entities.User;

import org.simplilearn.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductController {

	@Autowired
	ProductService productService;
	@RequestMapping("/product")
	public String showProduct(ModelMap model) {
		List<Product> products=productService.getProducts();
		model.addAttribute("products",products);
		
		return "product";
	}
	@RequestMapping("/delete/{productId}")
	public String deleteProduct(@PathVariable("productId") int productId) {
		productService.deleteProduct(productId);
		return "redirect:/product";
	}
	
	@RequestMapping("/addproduct")
	public String addProduct() {
		return "addProduct";
	}
	
	
	@RequestMapping(value = "/saveProduct", method=RequestMethod.POST)
	public String saveUser(@RequestParam ("productName") String productName,
			@RequestParam ("price") int price, @RequestParam ("discription") String discription){
		
		Product product=new Product();
		product.setProductName(productName);
		product.setPrice(price);
		product.setDiscription(discription);
		productService.addProduct(product);
		return "redirect:/product";
	}
	
}
