package com.com.order.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="orders")
public class Order {

	@Id
	@Column(name="order_id")
	private long orderId;
	
	@Column(name="order_name")
	private String orderName;
	
	@Column(name="order_amount")
	private int amount;
	
	
	public Order(long orderId, String orderName, int amount) {
		super();
		this.orderId = orderId;
		this.orderName = orderName;
		this.amount = amount;
		
	}
	public Order() {
		super();
	}
	public long getOrderId() {
		return orderId;
	}
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
	
}
