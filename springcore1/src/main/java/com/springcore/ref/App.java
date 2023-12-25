package com.springcore.ref;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("/com/springcore/ref/RefConfig.xml");
		A obj1=(A)context.getBean("aref1");
		A obj2=(A)context.getBean("aref2");
		A obj3=(A)context.getBean("aref3");
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);

	}

}
