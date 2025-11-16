package com.tnsif.genericexample;

public class genericClass<T> {
T data;

public T getData() {
	return data;
}

public void setData(T data) {
	this.data =  data;
}
@Override
public String toString() {
	return "GenericClass [data=" + data + "]";

}
}
