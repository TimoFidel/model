package com.com.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.com.order.model.Order;

public interface OrderRepository extends JpaRepository<Order,Integer> {

}
