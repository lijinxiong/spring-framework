package com.demo.design.mode;

import com.demo.design.mode.simpleFactory.FruitFactory;

/**
 * @author igola
 */
public class Apple implements Fruit {

	@Override
	public String getName() {
		return FruitFactory.APPLE;
	}

}
