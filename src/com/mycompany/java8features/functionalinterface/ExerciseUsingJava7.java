package com.mycompany.java8features.functionalinterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExerciseUsingJava7 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Vamsi", "Palli", 23), new Person("Bangaru", "Puletikurthi", 29),
				new Person("Amani", "Mekala", 24));

		// Sorting the persons list using last name
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person p1, Person p2) {
				return p1.getLastName().compareToIgnoreCase(p2.getLastName());
			}
		});

		// printing all the persons in the list
		for (Person p : people) {
			System.out.println(p);
		}

		// printing only people last name starting with P
		for (Person p : people) {
			if (p.getLastName().startsWith("P"))
				System.out.println(p);
		}
	}
}
