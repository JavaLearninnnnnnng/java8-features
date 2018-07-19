package com.mycompany.java8features.functionalinterface;

public class Person {
	private String FirstName;
	private String LastName;
	private int Age;

	public String getFirstName() {
		return FirstName;
	}

	public String getLastName() {
		return LastName;
	}

	public int getAge() {
		return Age;
	}

	public Person(String firstName, String lastName, int age) {
		super();
		FirstName = firstName;
		LastName = lastName;
		Age = age;
	}

	@Override
	public String toString() {
		return getFirstName() + " " + getLastName() + "\t" + getAge() + " years of age";
	}

}
