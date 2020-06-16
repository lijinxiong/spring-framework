package com.demo.beanpostprocessor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext classPathXmlApplicationContext =
				new ClassPathXmlApplicationContext("beanpostprocessor/coderLi.xml");
		System.out.println();

//		DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();
//		BeanDefinitionReader definitionReader = new XmlBeanDefinitionReader(defaultListableBeanFactory);
//		definitionReader.loadBeanDefinitions("beanpostprocessor/coderLi.xml");
//		defaultListableBeanFactory.addBeanPostProcessor(new Student());
//		defaultListableBeanFactory.getBean("student");
		System.out.println();
	}
}
