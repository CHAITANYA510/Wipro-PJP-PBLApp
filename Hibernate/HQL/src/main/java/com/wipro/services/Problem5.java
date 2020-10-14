package com.wipro.services;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.wipro.bean.Car;

public class Problem5 {

	public static void main(String[] args) {
		
		Configuration cfg = null;
		SessionFactory sf = null;
		Session session = null;
		CriteriaBuilder cb;
		CriteriaQuery<Car> criteriaquery;
		Root<Car> root;
		String color = "red";
		
		try {
			cfg = new Configuration().configure();
			sf = cfg.buildSessionFactory();
			session = sf.openSession();
			cb = session.getCriteriaBuilder();
			criteriaquery = cb.createQuery(Car.class);
			root = criteriaquery.from(Car.class);
			criteriaquery.select(root);
			Predicate predicate = cb.equal(root.get("color"), color);
			criteriaquery.where(predicate);
			Query<Car> query = session.createQuery(criteriaquery);
			List<Car> list = query.getResultList();
			System.out.println("Records retrieved are "+list.size());
			System.out.println("Cars details with color "+color+" are:");
			list.forEach(car -> System.out.println(car.toString()));
		}
		catch (Exception e) {
			System.out.println("Error occured");
			e.printStackTrace();
		}
		finally {
			session.close();
			sf.close();
		}
	}

}
