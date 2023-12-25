/**
 * 
 */
package com.springcore.stereotype.annotation;
import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext con=new ClassPathXmlApplicationContext("com/springcore/stereotype/annotation/configStereo.xml");
		Person p1=(Person)con.getBean("person");
		System.out.println(p1);
//		Person p2=(Person)con.getBean("person");
//		System.out.println(p2.hashCode());
	}

}
