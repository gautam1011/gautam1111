package com.gautam.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		
		DataService data =(DataService) context.getBean("dataservice");
		data.PrintNews();

	}

}
