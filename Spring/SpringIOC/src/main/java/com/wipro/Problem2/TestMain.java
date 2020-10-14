package com.wipro.Problem2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		ConstructorMessage cm = context.getBean(ConstructorMessage.class);
		System.out.println(cm.toString());
	}

}
