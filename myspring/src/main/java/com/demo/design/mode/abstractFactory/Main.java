package com.demo.design.mode.abstractFactory;

public class Main {

	public static void main(String[] args) {

		Factory factory1 = new ConcreteFactory1();
		System.out.println(factory1.createApple().getName());
		System.out.println(factory1.createOrange().getName());

		Factory factory2 = new ConcreteFactory2();
		System.out.println(factory2.createApple().getName());
		System.out.println(factory2.createOrange().getName());

	}
}
