package com.mycompany.java8features.lambdaexpressions;

public class LambdaExpressions {

	public static void main(String[] args) {
		StaticMethodStringLength(k -> k.length());
	}
	
	public static void StaticMethodStringLength(StringLength l) {
		System.out.println(l.getLength("Calling Lambda Expressions Through Static Method"));
	}
	
	interface StringLength {
		 int getLength(String s); 
	}
}