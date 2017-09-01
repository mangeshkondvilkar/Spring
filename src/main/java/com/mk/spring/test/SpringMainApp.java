package com.mk.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMainApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-test.xml");
		TestComponent testComponent = (TestComponent) context.getBean("testComponent");
		
		context.registerShutdownHook();
	}
}
