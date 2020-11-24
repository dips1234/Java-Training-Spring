package com.spring.scope.Entity;

public class Employee {
	
	private String name;

	public void getName() {
		System.out.println("Your Name : " + name);
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
