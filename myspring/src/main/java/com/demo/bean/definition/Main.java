package com.demo.bean.definition;

import org.springframework.beans.factory.support.*;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {
	public static void main(String[] args) {

//		defaultLoad();
//		manualLoadGeneric();
//		manualLoadParentGeneric();
		manualLoadRootAndChild();
	}

	private static void manualLoadRootAndChild() {

		DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();
		RootBeanDefinition rootBeanDefinition = new RootBeanDefinition();
		rootBeanDefinition.setBeanClass(Company.class);
		rootBeanDefinition.getPropertyValues().add("name", "XX");
		rootBeanDefinition.getPropertyValues().add("numberOfPeople", "1000");
		defaultListableBeanFactory.registerBeanDefinition("rootCompany", rootBeanDefinition);

		ChildBeanDefinition childBeanDefinition = new ChildBeanDefinition("rootCompany");
		defaultListableBeanFactory.registerBeanDefinition("childCompany", childBeanDefinition);

		defaultListableBeanFactory.addBeanPostProcessor(new MergedBeanDefinitionPostProcessor() {
			@Override
			public void postProcessMergedBeanDefinition(RootBeanDefinition beanDefinition, Class<?> beanType, String beanName) {
				System.out.println("beanName:" + beanName);
			}
		});

		System.out.println(defaultListableBeanFactory.getBean("rootCompany"));
		System.out.println(defaultListableBeanFactory.getBean("childCompany"));
		System.out.println(defaultListableBeanFactory.getBean("rootCompany") == defaultListableBeanFactory.getBean("childCompany"));

	}

	private static void defaultLoad() {
		Resource resource = new ClassPathResource("bean.definition/coderLi.xml");
		DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();
		BeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(defaultListableBeanFactory);
		beanDefinitionReader.loadBeanDefinitions(resource);
		System.out.println(defaultListableBeanFactory.getBean("company"));
	}
	private static void manualLoadGeneric(){
		DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();
		GenericBeanDefinition genericBeanDefinition = new GenericBeanDefinition();
		genericBeanDefinition.setBeanClass(Company.class);
		defaultListableBeanFactory.registerBeanDefinition("company", genericBeanDefinition);
		System.out.println(defaultListableBeanFactory.getBean("company"));
	}

	private static void manualLoadParentGeneric(){

		DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();
		GenericBeanDefinition parentBeanDefinition = new GenericBeanDefinition();
		parentBeanDefinition.setBeanClass(Company.class);
		parentBeanDefinition.getPropertyValues().add("name", "XX");
		parentBeanDefinition.getPropertyValues().add("numberOfPeople", "1000");
		defaultListableBeanFactory.registerBeanDefinition("parentCompany", parentBeanDefinition);

		GenericBeanDefinition childBeanDefinition = new GenericBeanDefinition();
		childBeanDefinition.setParentName("parentCompany");
		defaultListableBeanFactory.registerBeanDefinition("childCompany", childBeanDefinition);

		System.out.println(defaultListableBeanFactory.getBean("parentCompany"));
		System.out.println(defaultListableBeanFactory.getBean("childCompany"));
		System.out.println(defaultListableBeanFactory.getBean("parentCompany") == defaultListableBeanFactory.getBean("childCompany"));

	}

}
