package com.demo.serializable;

import java.io.Serializable;

public class Person implements Serializable {
	private static final long serialVersionUID = 1;

    private String name;
    private String wish;

	public Person() {
		System.out.println("person construct");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWish() {
		return wish;
	}

	public void setWish(String wish) {
		this.wish = wish;
	}
}