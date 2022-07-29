package com.javacourse.project.hibernateAndJpa.Entities;
import javax.persistence.*;
@Entity
@Table(name="city")
public class City {
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="Name")
	private String Name;
	@Column(name="CountyCode")
	private String CountyCode;
	@Column(name="District")
	private String District;
	@Column(name="Population")
	private int Population;
	public City()
	{}
	public City(int id, String name, String countyCode, String district, int population) {
		super();
		this.id = id;
		Name = name;
		CountyCode = countyCode;
		District = district;
		Population = population;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCountyCode() {
		return CountyCode;
	}
	public void setCountyCode(String countyCode) {
		CountyCode = countyCode;
	}
	public String getDistrict() {
		return District;
	}
	public void setDistrict(String district) {
		District = district;
	}
	public int getPopulation() {
		return Population;
	}
	public void setPopulation(int population) {
		Population = population;
	}
	
	
}
