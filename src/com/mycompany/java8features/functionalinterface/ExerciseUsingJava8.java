package com.mycompany.java8features.functionalinterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ExerciseUsingJava8 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Vamsi", "Palli", 23), new Person("Bangaru", "Puletikurthi", 29),
				new Person("Amani", "Mekala", 24), new Person("Sneha", "Toodi", 23));

		// Sorting the persons list using last name
		Collections.sort(people, (p1, p2) -> p1.getLastName().compareToIgnoreCase(p2.getLastName()));

		// printing all the persons in the list
		printconditionally(people, p -> true);
		
		// printing only people last name starting with P
		printconditionally(people, p -> p.getLastName().startsWith("M"));

		// printing only people first name starting with B
		printconditionally(people, p -> p.getFirstName().startsWith("B"));
	}

	private static void printconditionally(List<Person> people, condition condition) {
		for (Person p : people)
			if (condition.test(p))
				System.out.println("\n" + p);
	}

	interface condition {
		boolean test(Person p);
	}
}