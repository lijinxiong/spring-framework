package com.demo.data;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class Egg {

	private Chicken chicken;

	public Egg() {
		System.out.println();
	}

	public void setChicken(Chicken chicken) {
		this.chicken = chicken;
	}
}
