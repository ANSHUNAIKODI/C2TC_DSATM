package com.tnsif.genericexample;

public class GenericConstructors {
public double v;
public <T extends Number> GenericConstructors(T t){
	v=t.doubleValue();
	}
void show() {
	System.out.println("Value of v in double type is:"+v);
}
}
