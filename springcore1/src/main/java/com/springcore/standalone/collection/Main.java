/**
 * 
 */
package com.springcore.standalone.collection;
import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext con=new ClassPathXmlApplicationContext("com/springcore/standalone/collection/configAlone.xml");
		Person p1=(Person)con.getBean("person1");
		System.out.println(p1);
	}

}
