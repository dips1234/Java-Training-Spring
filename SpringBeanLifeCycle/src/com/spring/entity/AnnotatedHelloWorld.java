package com.spring.entity;
import javax.annotation.PostConstruct; 
import javax.annotation.PreDestroy; 
public class AnnotatedHelloWorld {

	 @PostConstruct
	    public void init() throws Exception 
	    { 
	        System.out.println( 
	            "Bean HelloWorld has been "
	            + "instantiated and I'm the "
	            + "init() method"); 
	    } 
	 
	 @PreDestroy
	    public void destroy() throws Exception 
	    { 
	        System.out.println( 
	            "Conatiner has been closed "
	            + "and I'm the destroy() method"); 
	    } 
}
