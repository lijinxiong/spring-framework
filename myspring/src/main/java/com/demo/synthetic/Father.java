package com.demo.synthetic;

public class Father {

	class Son {
		private String name;
	}

	public String getName(){
		return new Son().name;
	}



 }
