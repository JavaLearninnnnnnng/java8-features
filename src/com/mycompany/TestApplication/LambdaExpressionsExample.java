package com.mycompany.TestApplication;

public class LambdaExpressionsExample {

	public static void main(String[] args) {
		StaticMethodStringLength(k -> k.length());
	}
	
	public static void StaticMethodStringLength(StringLength l) {
		System.out.println(l.getLength("Hello Lambda"));
	}
	interface StringLength {
		 int getLength(String s); 
	}
}
