package com.spring.test;

import org.springframework.context.ConfigurableApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProgramaticBeanTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ConfigurableApplicationContext cap 
        = new ClassPathXmlApplicationContext( 
            "Beans.xml"); 
		cap.close();
	}

}
