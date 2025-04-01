package com.azhar;

public class Book {

	String name;
	int year;
	public Book(String name, int year) {
		super();
		this.name = name;
		this.year = year;
	}
	public String getName() {
		return name;
	}
	public int getYear() {
		System.out.println("Hello World");
		return year;
	}
	@Override
	public String toString() {
		return "Book [name=" + name + ", year=" + year + "]";
	}
	
	
}
