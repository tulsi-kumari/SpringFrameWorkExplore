package com.springcore.auto.wire.XML;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App {
	public static void main(String[] args)
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/auto/wire/XML/configAuto.xml");
		Employee emp1=(Employee)context.getBean("emp");
		System.out.println(emp1);
	}
}
