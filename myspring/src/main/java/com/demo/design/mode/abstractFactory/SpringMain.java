package com.demo.design.mode.abstractFactory;

import com.demo.design.mode.Fruit;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class SpringMain {
	public static void main(String[] args) {

		Resource resource = new ClassPathResource("design.mode.abstractFactory/coderLi.xml");
		DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
		BeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory);
		beanDefinitionReader.loadBeanDefinitions(resource);

		System.out.println(beanFactory.getBean("foxconnApple", Fruit.class).getName());
		System.out.println(beanFactory.getBean("foxconnOrange", Fruit.class).getName());
		System.out.println(beanFactory.getBean("haierApple", Fruit.class).getName());
		System.out.println(beanFactory.getBean("haierOrange", Fruit.class).getName());

	}
}
