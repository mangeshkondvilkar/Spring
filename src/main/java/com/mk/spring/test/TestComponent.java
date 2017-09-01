package com.mk.spring.test;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TestComponent {

	@Autowired
	private Child child;

	@Autowired
	@Qualifier("child")
	private Parent parent1;

	public TestComponent() {
		System.out.println("Spring loaded TestComponent bean into container...");
	}

	@PostConstruct
	public void init() {
		System.out.println("TestComponent => custom init() called...");
		System.out.println("Child autowired: " + child.getcName()+" : "+child.getpName());
		System.out.println("Parent autowired: " + parent1.getpName());
	}

	@PreDestroy
	public void destroy() {
		System.out.println("TestComponent => custom destroy() called...");
	}
}
