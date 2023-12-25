package com.springcore.springcore1;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        //we will ask our container to give us an object of student class instead of making it ourselves
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        //can give array of string also in case of many config files
        Student student1=(Student) context.getBean("student1");
        Student student2=(Student) context.getBean("student2");
        System.out.println(student1);
        System.out.println(student2);
    }
}
