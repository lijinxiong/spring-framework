package com.demo.data;



public class Chicken {

	private Cat cat;
	public Chicken() {
	}

	public void destroyMethod() {
		System.out.println("destroy method");
	}
	public void setCat(Cat cat) {
		this.cat = cat;
	}
}
