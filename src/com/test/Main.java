package com.test;

public class Main {

	public static void main(String[] args) {

		
		//
		Item apple = new Item("Apple",100);
		Item banana = new Item("Banana",80);
		Item orange = new Item("Orange",50);
		
		ShoppingCart shopping = new ShoppingCart();
		shopping.add(new Order(apple,1));
		shopping.add(new Order(banana,2));
		shopping.add(new Order(orange,2));
		
		int total = shopping.getTotal();
		System.out.println(total);
	}

}
