package com.spring.test;
import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;

import com.spring.entity.Employee;  
public class EmployeeTest {

	public static void main(String[] args) {  
	    Resource resource=new ClassPathResource("applicationContext.xml");  
	    BeanFactory factory=new XmlBeanFactory(resource);  
	      
	    Employee employee=(Employee)factory.getBean("employeebean");  
	    employee.displayname(); 
	    employee.displayAddress();
	} 
}
