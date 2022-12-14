package com.javacourse.project.hibernateAndJpa.DAL;

import java.util.List;
import javax.persistence.EntityManager;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.javacourse.project.hibernateAndJpa.Entities.City;
//JPA - ORM standardı
@Repository
public class HibernateCityDal implements ICityDal {

	private EntityManager entityManager;
	
	@Autowired
	public HibernateCityDal(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
//AOP - Aspect Oriented Programming
	@Override
	@Transactional
	public List<City> GetAll() {
		Session session = entityManager.unwrap(Session.class);
		List<City> cities = session.createQuery("from City",City.class).getResultList();
		return cities;
	}

	@Override
	@Transactional
	public void add(City city) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(city);
		
	}

	@Override
	@Transactional
	public void update(City city) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(city);
	}
	
	@Override
	@Transactional
	public void delete(City city) {
		Session session = entityManager.unwrap(Session.class);
		session.delete(city);
		
	}
	@Override
	@Transactional
	public City getByID(int id) {
		Session session = entityManager.unwrap(Session.class);
		City city = session.get(City.class, id);
		return city;
	}

}
