package com.demo.synthetic;


import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
	public static void main(String[] args) {

//		Class<Father.Son> clazz = Father.Son.class;
//		Field[] declaredFields = clazz.getDeclaredFields();
//
//		for (Field declaredField : declaredFields) {
//			System.out.println(declaredField.getName() + ":" + declaredField.isSynthetic());
//		}


		Class<Father.Son> clazz = Father.Son.class;
		Method[] declaredMethods = clazz.getDeclaredMethods();
		for (Method declaredMethod : declaredMethods) {

			System.out.println(declaredMethod.getName() + ":" + declaredMethod.isSynthetic());

		}

	}

}
