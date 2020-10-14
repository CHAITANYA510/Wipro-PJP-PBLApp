package com.wipro.Problem3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		SetterMessage sm = context.getBean(SetterMessage.class);
		System.out.println(sm.toString());

	}

}
