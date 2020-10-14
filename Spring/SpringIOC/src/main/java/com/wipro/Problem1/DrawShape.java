package com.wipro.Problem1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawShape {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Shape shape = null;
		
		shape = context.getBean(Triangle.class);
		shape.draw();
		
		shape = context.getBean(Rectangle.class);
		shape.draw();
		
		shape = context.getBean(Parallelogram.class);
		shape.draw();
		
	}

}
