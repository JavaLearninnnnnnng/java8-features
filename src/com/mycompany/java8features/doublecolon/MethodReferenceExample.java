package com.mycompany.java8features.doublecolon;

public class MethodReferenceExample {

	public static void main(String[] args) {
		
		Thread t = new Thread(MethodReferenceExample::doprocess);
		//This is equivalent to Thread t = new Thread(() -> doprocess())
		t.run();
		Thread t2 = new Thread(() -> doprocess());

	}
	 
	public static void doprocess() {
		System.out.println("This method is called through method calling");
	}

}
