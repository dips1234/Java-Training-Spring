package com.spring.scope.test;
import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;
import com.spring.scope.Entity.Employee;

public class ScopeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Resource resource=new ClassPathResource("Beans.xml");  
		    BeanFactory factory=new XmlBeanFactory(resource);  
		      
		    Employee employee=(Employee)factory.getBean("employeebean"); 
		    employee.setName("I am employee A");
		   employee.getName(); 
		   
		   Employee emp2=(Employee)factory.getBean("employeebean");
		  // emp2.setName("I am employee A & B");
		   emp2.getName();
		   //employee.getName();
		   

	}

}
