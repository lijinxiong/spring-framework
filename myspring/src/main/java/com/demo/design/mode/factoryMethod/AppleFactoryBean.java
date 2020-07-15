package com.demo.design.mode.factoryMethod;

import com.demo.design.mode.Apple;
import org.springframework.beans.factory.FactoryBean;

public class AppleFactoryBean implements FactoryBean<Apple> {
	@Override
	public Apple getObject() throws Exception {
		return new Apple();
	}

	@Override
	public Class<?> getObjectType() {
		return Apple.class;
	}

}
