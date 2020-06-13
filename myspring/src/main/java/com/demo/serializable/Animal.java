package com.demo.serializable;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Animal implements Externalizable {

	private static final long serialVersionUID = 12;

	private String name;
	private int age;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Animal{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		System.out.println(out.getClass().getSimpleName());
		out.writeInt(age);
		out.writeObject(name);

	}


	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		System.out.println(in.getClass().getSimpleName());
		age = in.readInt();
		name = (String) in.readObject();
	}
}
