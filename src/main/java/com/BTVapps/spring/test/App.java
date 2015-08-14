package com.BTVapps.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/BTVapps/spring/test/beans/beans.xml");
		
		
		Person person = (Person) context.getBean("person");
		person.speak();
		Address address = (Address) context.getBean("address");
		
		System.out.println(person.toString());
		
		// close the applicaton context
		((ClassPathXmlApplicationContext) context).close();
		
	}

}
