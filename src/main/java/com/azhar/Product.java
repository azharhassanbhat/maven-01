package com.azhar;

public class Product {

	String name;
	int price;
	
	
	
	public Product(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}



	public String getName() {
		return name;
	}



	public int getPrice() {
		return price;
	}



	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}
	
	
}
