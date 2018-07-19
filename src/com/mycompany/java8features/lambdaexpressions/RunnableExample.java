package com.mycompany.java8features.lambdaexpressions;

public class RunnableExample {

	public static void main(String[] args) {
		Thread myThread = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Runnable method call using Anonymous class");
			}
		});
		myThread.run();
		
		Thread myLambdaThread = new Thread(
				() -> System.out.println("Runnable method call using lambda expression"));
		myLambdaThread.run();
	}
	

}
