package com.demo.data;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class Egg {

	@Autowired
	private Chicken chicken;

	public Egg() {
		System.out.println();
	}
}
