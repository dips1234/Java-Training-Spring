package com.spring.entity;

import org.springframework.beans.factory.DisposableBean;

import org.springframework.beans.factory.InitializingBean;

public class ProgrammaticHelloWorld implements InitializingBean, DisposableBean {

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println( 
	            "Conatiner has been closed "
	            + "and I'm the destroy() method");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println( 
	            "Bean HelloWorld has been "
	            + "instantiated and I'm the "
	            + "init() method"); 
		
	}

}
