package com.wipro.Problem4;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Map<String, Student> s1 = context.getBeansOfType(Student.class);
		
		s1.forEach((s2,s3) -> {
			System.out.println(s2);
			System.out.println(s3);
		});
		

	}

}
