package com.spring.test;

import org.springframework.context.ConfigurableApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.entity.HelloWorld;

public class BeanLifeCycleTest {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		ConfigurableApplicationContext cap 
        = new ClassPathXmlApplicationContext( 
            "applicationContext.xml");
		cap.close(); 

	}

}
