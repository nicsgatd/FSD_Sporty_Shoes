package org.simplilearn.controller;


import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import javax.persistence.Id;

import org.aspectj.weaver.NewConstructorTypeMunger;
import org.simplilearn.dao.AdminDao;
import org.simplilearn.entities.Admin;
import org.simplilearn.entities.Order;
import org.simplilearn.entities.Product;
import org.simplilearn.entities.Purchase;
import org.simplilearn.entities.User;
import org.simplilearn.repositories.AdminRepository;
import org.simplilearn.repositories.ProductRepository;
import org.simplilearn.services.AdminService;
import org.simplilearn.services.OrderService;
import org.simplilearn.services.ProductService;

import org.simplilearn.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SportyController {
	

	@Autowired
	AdminRepository adminRepository;
	
	@Autowired
	AdminService adminService;
	
	@Autowired
	UserService userService;
	
	@Autowired
	ProductService productService;
	
	//@Autowired
//	PurchaseService purchaseService;
	
	@Autowired
	OrderService orderService;

	
	@RequestMapping("/")
	public String showHome() {
		return "index";
	}
	
	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public String logUser() {
		return "user";
	}
	
	@RequestMapping(value = "/userSave", method=RequestMethod.POST)
	public String saveUser(@RequestParam ("name") String name,
			@RequestParam ("email") String emai, @RequestParam ("age") String age,
			@RequestParam ("gender") String gender, @RequestParam ("address") String address){
		User user=new User();
		user.setName(name);
		user.setEmail(emai);
		user.setAge(age);
		user.setGender(gender);
		user.setAddress(address);
		userService.addUser(user);
		return "index";
	}
	
	@RequestMapping(value = "/admin", method = RequestMethod.POST)
	public String logAdmin(ModelMap model){
		
		List<Order> order=orderService.getOrders();
		model.addAttribute("order",order);
			
		return "admin";
	}
	
	@RequestMapping(value = "/logAdmin", method = RequestMethod.POST)
	public String adminDashboard(ModelMap model, @RequestParam ("username") String username, 
			@RequestParam("password") String password){
		List<Order> order=orderService.getOrders();
		model.addAttribute("order",order);
		Admin admin=adminService.getAdminByUsername(username);
		if (admin != null) {
			if (admin.getUsername().equals(username)&&admin.getPassword().equals(password)) {
				model.put("uname", username);
				System.out.println(username);
				return "dashboard";
				
			}			
			else {
				model.put("errorMsg", "Please Enter Right Password");
				return "admin";
			}
		}else {
			model.put("errorMsg", "Invalid Username");
			return "admin";
		}
		
	}
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String openRegistration(){
		return "register";
	}
	
	@RequestMapping(value = "/saveRegistration", method = RequestMethod.POST)
	public String saveRegister(ModelMap model,@RequestParam ("username") String username, @RequestParam("password") String password){
		Admin admin=new Admin();
		admin.setUsername(username);
		admin.setPassword(password);
		adminService.insertAdmin(admin);
		return "admin";
	}
	@RequestMapping(value = "/updatePassword", method = RequestMethod.GET)
	public String UpdatePass(){
		return "updatePassword";
	}
	@RequestMapping(value = "/passwordChanged", method = RequestMethod.POST)
	public String savePassword(ModelMap model,
			@RequestParam ("username") String username, @RequestParam("password") String password){
	
		Admin admin=adminService.getAdminByUsername(username);
		if(admin.getUsername().equals(username)) {
			admin.setPassword(password);
			adminService.updateAdmin(username, admin);
			return "admin";
		}
		else {
			model.put("errorMsg", "Invalid Username");
			return "updatePassword";
		}
		
	}
	
	@RequestMapping("/viewUser")
	public String showUser(ModelMap model) {
		List<User> user=userService.getUsers();
		model.addAttribute("user",user);
		
		return "viewUser";
	} 
	
	@Autowired
	ProductRepository productRepository;
	@RequestMapping("/dashboard")
	public String showDashboard(ModelMap model) {
		
	//	List<Purchase> purchase=purchaseService.getPurchase();
	//	model.addAttribute("purchase",purchase);		
		List<Order> order=orderService.getOrders();
		model.addAttribute("order",order);
		return "dashboard";
	}
	
	


}
