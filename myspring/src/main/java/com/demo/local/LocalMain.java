package com.demo.local;

import java.util.Locale;

public class LocalMain {

	public static void main(String[] args) {

		Locale locale1 = new Locale("zh", "CN");
		Locale locale2 = new Locale("zh");

		// 等同于 locale1
		Locale locale3 = Locale.CHINA;
		// 等于 locale2
		Locale locale4 = Locale.CHINESE;


		Locale locale5 = Locale.getDefault();


	}

}
