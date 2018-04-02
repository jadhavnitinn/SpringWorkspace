package com.loglogic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context1 = new ClassPathXmlApplicationContext("com/loglogic/spring.xml");
		ApplicationContext context2 = new ClassPathXmlApplicationContext("com/loglogic/spring.xml");

		Emp emp1 = (Emp) context1.getBean("e");
		Emp emp2 = (Emp) context1.getBean("e");
		Emp emp3 = (Emp) context2.getBean("e");
		
		
		Emp emp4 = (Emp) context1.getBean("e");
		Emp emp5 = (Emp) context1.getBean("e");
		Emp emp6 = (Emp) context2.getBean("e2");
		System.out.println("......................................................................................");

		System.out.println(emp1 == emp2);
		System.out.println(emp1.equals(emp2));
		System.out.println(emp1 == emp3);
		System.out.println(emp1.equals(emp3));

		System.out.println(emp1 == emp6);
		System.out.println(emp1.equals(emp6));
		System.out.println(emp3 == emp6);
		System.out.println(emp3 .equals(emp6));
		
		System.out.println("......................................................................................");
		System.out.println(emp1.hashCode()+"   "+emp1.hashCode());
		System.out.println(emp3.hashCode()+"   "+emp4.hashCode());
		System.out.println(emp5.hashCode()+"   "+emp6.hashCode());
		

	}

}
