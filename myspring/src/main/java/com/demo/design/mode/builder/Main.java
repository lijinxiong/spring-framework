package com.demo.design.mode.builder;

public class Main {

	public static void main(String[] args) {

		User.UserBuilder userBuilder = new User.UserBuilder();
		User user = userBuilder.firstName("li").lastName("xx").address("GZ").age(25).phone("188xxxxx").build();
	}
}
