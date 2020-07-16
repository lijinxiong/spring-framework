package com.demo.appliction.context;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext classPathXmlApplicationContext =
				new ClassPathXmlApplicationContext("coderLi.xml");

		classPathXmlApplicationContext.publishEvent(new MyEvent("hello", "msg"));

		System.out.println();
	}
}
