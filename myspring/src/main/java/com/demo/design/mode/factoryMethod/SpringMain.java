package com.demo.design.mode.factoryMethod;

import com.demo.design.mode.Fruit;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class SpringMain {
	public static void main(String[] args) {

		Resource resource = new ClassPathResource("design.mode.factoryMethod/coderLi.xml");
		DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();
		BeanDefinitionReader definitionReader = new XmlBeanDefinitionReader(defaultListableBeanFactory);
		definitionReader.loadBeanDefinitions(resource);

		System.out.println(defaultListableBeanFactory.getBean("apple", Fruit.class).getName());
		System.out.println(defaultListableBeanFactory.getBean("orange", Fruit.class).getName());

	}
}
