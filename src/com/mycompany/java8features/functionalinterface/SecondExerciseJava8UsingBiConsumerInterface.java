package com.mycompany.java8features.functionalinterface;

import java.util.function.BiConsumer;

public class SecondExerciseJava8UsingBiConsumerInterface {

	public static void main(String[] args) {
		int [] numbers =  {1,5,6,8,10};
		int key = 0;
		
		//Print all the numbers
		process(numbers, key, lambdaWrapper((k, v)-> System.out.println(k)));
		
		//Add the key to the numbers and print
		process(numbers, key, lambdaWrapper((k, v)-> System.out.println(k + v)));
		
		//Divide the numbers with key and print
		process(numbers, key, lambdaWrapper((k, v)-> System.out.println(k / v)));
		
		//Multiply the numbers with key and print
		process(numbers, key, lambdaWrapper((k, v)-> System.out.println(k * v)));
		
	}
	public static void process(int[] numbers, int key, BiConsumer<Integer, Integer> consumer) {
		for(int i:numbers)
			consumer.accept(i, key);
	}
	public static BiConsumer<Integer, Integer> lambdaWrapper(BiConsumer<Integer, Integer> wrapperConsumer){
		return (i, key) ->{
		try {
				wrapperConsumer.accept(i, key);
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception was araised");
		}
		};
	}
}
