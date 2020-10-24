package com.wipro.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserMain1 {

	public static void main(String[] args) {
		
		/*
		Resource resource = new FileSystemResource("src/main/resources/beans.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		*/
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Movie movie = context.getBean(Movie.class);
		movie.display();
		
	}

}
