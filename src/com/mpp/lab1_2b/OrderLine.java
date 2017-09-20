package com.mpp.lab1_2b;

public class OrderLine {
	private int lineNo;
	private double price;
	private int quantity;
	Order order;
	
	OrderLine(int lineNo, double price, int quantity, Order ord){
		this.lineNo = lineNo;
		this.price  = price;
		this.quantity = quantity;
		order = ord;
	}
}
