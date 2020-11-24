package com.spring.test;

import org.springframework.context.ConfigurableApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotatedBeanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConfigurableApplicationContext cap = new ClassPathXmlApplicationContext("Spring.xml");

		// It will close the Spring container
		// and as a result invokes the
		// destroy() method
		cap.close();
	}

}
