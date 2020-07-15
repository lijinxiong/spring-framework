package com.demo.design.mode.simpleFactory;

import com.demo.design.mode.Apple;
import com.demo.design.mode.Fruit;
import com.demo.design.mode.Orange;

/**
 * @author igola
 */
public class FruitFactory {

	public static final String APPLE = "apple";
	public static final String ORANGE = "orange";

	public static Fruit getFruit(String fruitName) {
		if (APPLE.equalsIgnoreCase(fruitName)) {
			return new Apple();
		} else if (ORANGE.equalsIgnoreCase(fruitName)) {
			return new Orange();
		}
		return null;
	}

}
