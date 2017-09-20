package com.mpp.lab1_2b;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private int orderNum;
	private String dateOfOrder;
	List<OrderLine> ol;
	
	Order(int orderNum, String dateOfOrder, int lineNo, double price, int quantity){
		this.orderNum = orderNum;
		this.dateOfOrder = dateOfOrder;
		ol = new ArrayList<OrderLine>();
		addOrderLine(lineNo, price, quantity);
	}

	public void addOrderLine(int lineNo, double price, int quantity){
		ol.add(new OrderLine(lineNo, price, quantity, this));
	}
	
	public int getOrderNum() {
		return orderNum;
	}

	public String getDateOfOrder() {
		return dateOfOrder;
	}

	public List<OrderLine> getOl() {
		return ol;
	}
	

}
