package com.springcore.cons;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("/com/springcore/cons/conConfig.xml");
		Person p1=(Person)context.getBean("per1");
		System.out.println(p1);

	}

}
