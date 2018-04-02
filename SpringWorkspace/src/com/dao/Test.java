package com.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context=new ClassPathXmlApplicationContext("com/dao/spring.xml");
		EmpBean m=(EmpBean)context.getBean("e");
		
		Emp emp=new Emp();
		emp.setId(2);
		emp.setFirstName("Kiran");
		emp.setLastName("Survase");
		emp.setSalary(15000);
		
		m.save(emp);
		m.ViewAll();
	
	}

}
