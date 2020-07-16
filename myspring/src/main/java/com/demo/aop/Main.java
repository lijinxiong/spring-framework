package com.demo.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext classPathXmlApplicationContext =
				new ClassPathXmlApplicationContext("aop/coderLi.xml");

		TestBean bean = classPathXmlApplicationContext.getBean(TestBean.class);
		bean.test();

		System.out.println();
	}
}
