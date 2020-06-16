package com.demo.beanpostprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class Student implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println(this.getClass().getSimpleName() + ":postProcessBeforeInitialization:" + beanName);
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println(this.getClass().getSimpleName() + ":postProcessAfterInitialization:" + beanName);
		return bean;
	}

}
