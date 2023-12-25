package com.springcore.collections;
import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context= new ClassPathXmlApplicationContext("/com/springcore/collections/empConfig.xml");
		Employee emp1=(Employee)context.getBean("emp1");
		System.out.println(emp1);
				

	}

}
