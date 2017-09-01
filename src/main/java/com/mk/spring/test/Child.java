package com.mk.spring.test;

import org.springframework.stereotype.Component;

@Component
public class Child extends Parent {

	private String cName;

	public Child() {
		this.cName = "ChildName";
		System.out.println("Spring loaded Child bean into container...");
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}
}
