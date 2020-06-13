package com.demo.serializable;

import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception{
//		serialize();
//		deserialize();

		serializeExternal();
		deserializeExternal();
	}

	private static void serialize() throws Exception {

		Person person = new Person();
		person.setName("coderLi");
		person.setWish("被关注");

		FileOutputStream fileOutputStream = new FileOutputStream("coderLi.per");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(person);

		objectOutputStream.close();
		fileOutputStream.close();

	}

	private static void deserialize() throws Exception {

		FileInputStream fileInputStream = new FileInputStream("coderLi.per");
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		Person person = (Person) objectInputStream.readObject();
		System.out.println(person);
	}



	private static void serializeExternal()   {

		Animal animal = new Animal();
		animal.setName("pig");
		animal.setAge(2);

		FileOutputStream fileOutputStream = null;
		try {
			fileOutputStream = new FileOutputStream("animal.ani");
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(animal);

			objectOutputStream.close();
			fileOutputStream.close();

		} catch (Exception e) {
			e.printStackTrace();
		}


	}

	private static void deserializeExternal() throws Exception {

		FileInputStream fileInputStream = new FileInputStream("animal.ani");
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		Animal animal = (Animal) objectInputStream.readObject();
		System.out.println(animal);
	}



}
