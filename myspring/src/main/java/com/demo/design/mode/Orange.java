package com.demo.design.mode;

import com.demo.design.mode.simpleFactory.FruitFactory;

/**
 * @author igola
 */
public class Orange implements Fruit {


	@Override
	public String getName() {
		return FruitFactory.ORANGE;
	}

}
