package com.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		//ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(IocConfig.class);
		//ICustomerDal customerDal = context.getBean("database",ICustomerDal.class);
		ICustomerService customerService = context.getBean("service",ICustomerService.class);
		//CustomerManager mn = new CustomerManager(context.getBean("database",ICustomerDal.class));
		customerService.add();

	}

}
