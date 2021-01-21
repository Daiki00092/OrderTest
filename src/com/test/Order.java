package com.test;

public class Order {

	private Item item;
	private int qty;


	public Order(Item item, int qty) {
		this.item = item;
		this.qty = qty;
	}

	public Item getItem() {
		return item;
	}
	public int getQty() {
		return qty;
	}
	
	public int gettotal() {
		int result = item.getPrice() * this.qty;
		return result;
	}
	
}
