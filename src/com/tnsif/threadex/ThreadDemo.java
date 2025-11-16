package com.tnsif.threadex;

public class ThreadDemo {
	public static void main(String[]args) {
		childThread obj = new childThread(5, "Hello");
		childThread obj1 = new childThread(4, "World");
		obj.start();
		obj1.start();
		obj.run();
	System.out.println("---------End of Main------");
	}
}
