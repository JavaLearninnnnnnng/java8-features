package com.mycompany.java8features.functionalinterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ExerciseUsingJava8PredicateInterface {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Vamsi", "Palli", 23), new Person("Bangaru", "Puletikurthi", 25),
				new Person("Amani", "Mekala", 24), new Person("Sneha", "Toodi", 23));

		// Sorting the persons list using last name
		Collections.sort(people, (p1, p2) -> p1.getLastName().compareToIgnoreCase(p2.getLastName()));

		// printing all the persons in the list
		printconditionally(people, p -> true, p -> System.out.println(p));

		// printing only people last name starting with P
		printconditionally(people, p -> p.getLastName().startsWith("M"), p -> System.out.println(p));

		// printing only people first name starting with B
		printconditionally(people, p -> p.getFirstName().startsWith("B"), p -> System.out.println(p));
	}

	private static void printconditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consume) {
		for (Person p : people)
			if (predicate.test(p))
				consume.accept(p);
	}

}