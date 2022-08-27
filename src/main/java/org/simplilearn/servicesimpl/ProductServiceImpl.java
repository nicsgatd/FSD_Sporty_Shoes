package org.simplilearn.servicesimpl;

import java.util.List;
import java.util.Optional;

import org.simplilearn.entities.Product;
import org.simplilearn.exceptions.AdminNotFound;
import org.simplilearn.repositories.ProductRepository;
import org.simplilearn.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.extern.slf4j.Slf4j;

@Service
@Transactional
@Slf4j
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepository productRepository;
	@Override
	public void addProduct(Product product) {
		log.info("Inside insert product method");
		productRepository.save(product);
		
	}
	@Override
	public void deleteProduct(int productId) {
		log.info("Inside insert product method");
		productRepository.deleteById(productId);
	}

	
	@Override
	public List<Product> getProducts() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}
	
	@Override
	public Product getProductsById(int ProductId) {
		// TODO Auto-generated method stub
		log.info("Inside get employee method");
		return productRepository.findById(ProductId).orElseThrow(()-> new AdminNotFound("Employee not found"));	
	}
	

}
