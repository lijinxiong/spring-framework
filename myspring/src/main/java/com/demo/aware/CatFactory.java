package com.demo.aware;

import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.FactoryBean;

public class CatFactory implements FactoryBean<Cat> , BeanNameAware, BeanClassLoaderAware {

	@Override
	public Cat getObject() throws Exception {
		return new Cat();
	}


	@Override
	public Class<?> getObjectType() {
		return Cat.class;
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("bean Name aware [bean Name is] :" + name);

	}


	@Override
	public void setBeanClassLoader(ClassLoader classLoader) {
		System.out.println(classLoader.getClass().getSimpleName());
	}
}
