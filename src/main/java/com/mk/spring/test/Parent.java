package com.mk.spring.test;

import org.springframework.stereotype.Component;

//@Component
public class Parent {

	private String pName;

	public Parent() {
		this.pName = "ParentName";
		System.out.println("Spring loaded Parent bean into container...");
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}
}
