package com.javacourse.project.hibernateAndJpa.DAL;

import java.util.List;

import com.javacourse.project.hibernateAndJpa.Entities.City;

public interface ICityDal {
	List<City> GetAll();
	void add(City city);
	void delete(City city);
	void update(City city);
	City getByID(int id);
}
