package com.demo.bean.definition;

public class Company {
	private String name;
	private int numberOfPeople;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberOfPeople() {
		return numberOfPeople;
	}

	public void setNumberOfPeople(int numberOfPeople) {
		this.numberOfPeople = numberOfPeople;
	}

	@Override
	public String toString() {
		return "Company{" +
				"name='" + name + '\'' +
				", numberOfPeople=" + numberOfPeople +
				'}';
	}
}
