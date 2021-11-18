package com.com.order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.com.order.model.Order;
import com.com.order.repository.OrderRepository;

@RestController
public class OrderController {
	
	@Autowired
	OrderRepository orderRepository;
	
	
	@GetMapping("/order")
	public List<Order> getOrders(){
		return orderRepository.findAll();
	}
	
	@PostMapping("/order")
	public Order saveOrder(@RequestBody Order order) {
		return orderRepository.save(order);
	}

}
