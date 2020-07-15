package com.demo.design.mode.factoryMethod;

import com.demo.design.mode.Orange;
import org.springframework.beans.factory.FactoryBean;

public class OrangeFactoryBean implements FactoryBean<Orange> {
	@Override
	public Orange getObject() throws Exception {
		return new Orange();
	}

	@Override
	public Class<?> getObjectType() {
		return Orange.class;
	}

}
