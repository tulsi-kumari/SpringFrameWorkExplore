package com.springcore.lifecycleMethods;
import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("/com/springcore/lifecycleMethods/lifecycleConfig.xml");
		Person p1=(Person)context.getBean("p1");
		System.out.println(p1);
		System.out.println("We are using bean using xml");
		UsingInterface p2=(UsingInterface)context.getBean("p2");
		UsingAnnotation p3=(UsingAnnotation)context.getBean("p3");
		context.registerShutdownHook();
		

	}

}
