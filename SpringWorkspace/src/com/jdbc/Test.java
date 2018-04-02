package com.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context=new ClassPathXmlApplicationContext("com/jdbc/NewFile.xml");
		JdbcDemo m=(JdbcDemo)context.getBean("e");
		
		Emp emp=new Emp();
		emp.setId(1);
		emp.setFirstName("Sachin");
		emp.setLastName("Jadhav");
		emp.setSalary(5000);
		
		int i=m.saveEmp(emp);
		System.out.println("Success..."+i);
	}

}
