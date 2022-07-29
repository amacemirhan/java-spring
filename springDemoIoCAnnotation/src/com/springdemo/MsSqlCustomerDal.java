package com.springdemo;

import org.springframework.beans.factory.annotation.Value;

//import org.springframework.stereotype.Component;

//@Component("database")//ayni anda iki yere konmaz config dosyasinda bean tanimi daha iyi
public class MsSqlCustomerDal implements ICustomerDal{
	@Value("${database.connectionString}")
	String connectionString;
	public String getConnectionString() {
		return connectionString;
	}
	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}
	@Override
	public void add() {
		System.out.println("Connection String: "+ this.connectionString);
		System.out.println("mssql");
		
	}

}
