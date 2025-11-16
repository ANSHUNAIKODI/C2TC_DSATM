package com.tnsif.genericexample;

public class genericClassTest {
	public static void main(String[] args) {
		genericClass<String> obj = new genericClass<String>();
		obj.setData("hello");
		System.out.println(obj);
		//obj.setData(10);
		//obj.setData(12.3f);
		
		genericClass<Integer> obj1 = new genericClass<Integer>();
		obj1.setData(10);
		System.out.println(obj1);

	}

}
