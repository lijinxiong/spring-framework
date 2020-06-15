package com.demo.aware;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * @author jinxiong
 */
public class Main {

	public static void main(String[] args) {
		applicationContext();
	}

	private static void beanFactory(){
		Resource resource = new ClassPathResource("aware/coderLi.xml");
		DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(defaultListableBeanFactory);
		xmlBeanDefinitionReader.loadBeanDefinitions(resource);
		defaultListableBeanFactory.getBean("customer");
		defaultListableBeanFactory.getBean("cat");
		System.out.println();
	}

	private static void applicationContext(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("aware/coderLi.xml");
	}
}
