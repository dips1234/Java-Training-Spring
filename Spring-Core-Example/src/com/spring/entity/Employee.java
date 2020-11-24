package com.spring.entity;

public class Employee {
	
	private String name;
	private String add;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void displayname() {
		System.out.println("Display Name :"+name);
	}
	public void displayAddress() {
		System.out.println("Display Name :"+add);
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

}
