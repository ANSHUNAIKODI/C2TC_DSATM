package com.tnsif.genericexample;

public class GenericMethod {
public <E> void displayArrayElements(E[]elements) {
for(E i : elements )
	System.out.println("the elements are"+i);
}
}
