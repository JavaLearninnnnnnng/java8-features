package com.mycompany.java8features.doublecolon;

import java.util.Arrays;
import java.util.List;

import com.mycompany.java8features.functionalinterface.Person;

public class MethodReferenceExample2 {

	public static void main(String[] args) {

	List<Person> people = Arrays.asList(new Person("Vamsi", "Palli", 23), new Person("Bangaru", "Puletikurthi", 29),
			new Person("Amani", "Mekala", 24));
	people.forEach(System.out::println);
	people.forEach((p) -> {
		if(p.getFirstName().startsWith("A"))
		System.out.println(p);
		});
	}
}
