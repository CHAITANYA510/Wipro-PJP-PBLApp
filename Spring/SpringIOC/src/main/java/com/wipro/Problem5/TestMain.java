package com.wipro.Problem5;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		Map<String, Player> players = context.getBeansOfType(Player.class);
		players.forEach((p,p1) -> {
			System.out.println(p);
			System.out.println(p1);
		});
		
		
		Map<String, Country> countries = context.getBeansOfType(Country.class);
		countries.forEach((c,c1) -> {
			System.out.println(c);
			System.out.println(c1);
		});
		
	}

}
