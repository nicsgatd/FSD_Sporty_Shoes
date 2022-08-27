package org.simplilearn.controller;

import java.time.LocalDate;
import java.util.List;

import org.simplilearn.entities.Order;
import org.simplilearn.entities.Product;
import org.simplilearn.entities.Purchase;
import org.simplilearn.entities.User;
import org.simplilearn.services.OrderService;
import org.simplilearn.services.ProductService;
import org.simplilearn.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OrderController {

	@Autowired
	OrderService orderService;
	
	@Autowired
	ProductService productService;
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value="/saveOrder", method= RequestMethod.POST)
	public String placeOrder(@RequestParam ("productName") String productName,
			@RequestParam ("price") int price, @RequestParam ("email") String email, @RequestParam("purchasedate") String purchasedate){
		
	
		Order order=new Order();
		order.setProductid(productName);
		order.setPrice(price);
		order.setUserid(email);
		order.setPurchasedate(purchasedate);
		
		orderService.insertOrder(order);
		
	
	
		return "dashboard";
	}
	
	@RequestMapping("/purchase")
	public String postOrder(ModelMap model){
		
		List<Product> products=productService.getProducts();
		List<User> user1=userService.getUsers();
		model.addAttribute("products",products);
		model.addAttribute("user", user1);
	
	
		return "purchase";
	}
	
	
//	@RequestMapping(value = "/saveOrder1", method=RequestMethod.POST)
//	public String saveOrders(ModelMap model,@RequestParam ("productName") List<Product> productName,
//			@RequestParam ("price") List<Product> price, @RequestParam ("user") List<User> email,
//			@RequestParam ("localData") LocalDate localDate){
//		
//		List<Product> products=productService.getProducts();
//		List<User> user1=userService.getUsers();
//		model.addAttribute("products",products);
//		model.addAttribute("user", user1);
//	
//		
//		Order order=new Order();
//		order.setProduct(productName);
//		order.setProduct(price);
//		order.setUser(email);
//		order.setLocalDate(localDate);
//		
//		orderService.insertOrder(order);
//		
//		return "redirect:/product";
//	}
	
}
