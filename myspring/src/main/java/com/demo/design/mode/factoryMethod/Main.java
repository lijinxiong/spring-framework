package com.demo.design.mode.factoryMethod;

public class Main {
	public static void main(String[] args) throws Exception {
		OrangeFactoryBean orangeFactoryBean = new OrangeFactoryBean();
		System.out.println(orangeFactoryBean.getObject().getName());
		AppleFactoryBean appleFactoryBean = new AppleFactoryBean();
		System.out.println(appleFactoryBean.getObject().getName());
	}

}
