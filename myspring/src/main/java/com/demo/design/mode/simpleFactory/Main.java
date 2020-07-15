package com.demo.design.mode.simpleFactory;

public class Main {


	public static void main(String[] args) {

		System.out.println(FruitFactory.getFruit(FruitFactory.APPLE).getName());
		System.out.println(FruitFactory.getFruit(FruitFactory.ORANGE).getName());

	}
}
