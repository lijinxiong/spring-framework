package com.demo.design.mode.abstractFactory;

import com.demo.design.mode.Apple;
import com.demo.design.mode.Fruit;
import com.demo.design.mode.Orange;

public class ConcreteFactory2 implements Factory{
	@Override
	public Fruit createOrange() {
		return new Orange(){
			@Override
			public String getName() {
				return "海尔" + super.getName();
			}

		};
	}

	@Override
	public Fruit createApple() {
		return new Apple(){
			@Override
			public String getName() {
				return "海尔" + super.getName();
			}
		};
	}
}
