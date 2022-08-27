package org.simplilearn.services;

import java.util.List;

import org.simplilearn.entities.Order;

public interface OrderService {
	
	public void insertOrder(Order order);
	
	public List<Order> getOrders();

}
