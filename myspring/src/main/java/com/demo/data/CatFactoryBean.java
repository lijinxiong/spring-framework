package com.demo.data;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author jinxiong
 */
public class CatFactoryBean implements FactoryBean<Cat>, BeanFactoryAware {

	private BeanFactory beanFactory;
	@Override
	public Cat getObject() throws Exception {
		beanFactory.getBean("chicken");
		return new Cat();
	}


	@Override
	public Class<?> getObjectType() {
		return Cat.class;
	}


	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		this.beanFactory = beanFactory;
	}
}
