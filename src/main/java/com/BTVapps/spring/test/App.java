package com.BTVapps.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/BTVapps/spring/test/beans/beans.xml");
		
		
		Person person1 = (Person) context.getBean("person");
		Person person2 = (Person) context.getBean("person");
		Address address = (Address) context.getBean("address");
		
		person1.setTaxId(666);
		System.out.println(person2);
		
		// close the applicaton context
		((ClassPathXmlApplicationContext) context).close();
		
	}

}
 