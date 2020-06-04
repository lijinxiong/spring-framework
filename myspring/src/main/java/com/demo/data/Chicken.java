package com.demo.data;


import org.springframework.beans.factory.annotation.Autowired;

public class Chicken {
	@Autowired
	private Egg egg;

	public Chicken() {

	}
}
