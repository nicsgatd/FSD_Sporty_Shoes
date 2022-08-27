package org.simplilearn.services;

import java.util.List;

import org.simplilearn.entities.Product;


public interface ProductService {
	
	void addProduct(Product product);
	
	void deleteProduct(int dno);
	
	List<Product> getProducts();
	
	Product getProductsById(int ProductId);

}
