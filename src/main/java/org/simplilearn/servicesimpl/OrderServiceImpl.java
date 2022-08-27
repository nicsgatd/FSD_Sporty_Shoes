package org.simplilearn.servicesimpl;

import java.util.List;

import org.simplilearn.entities.Order;
import org.simplilearn.repositories.orderRepository;
import org.simplilearn.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.extern.slf4j.Slf4j;

@Service
@Transactional
@Slf4j
public class OrderServiceImpl implements OrderService{

	@Autowired
	orderRepository orderRepository;
	
	@Override
	public void insertOrder(Order order) {
		// TODO Auto-generated method stub
		log.info("Inside insert Order Method");
		orderRepository.save(order);
	}

	@Override
	public List<Order> getOrders() {
		// TODO Auto-generated method stub
		return orderRepository.findAll();
	}

}
