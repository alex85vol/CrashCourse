package com.softserve.edu1;

public class Box2<T> {
	// T stands for "Type".
	private T t;

	public void setObject(T t) {
		this.t = t;
	}

	public T getObject() {
		return t;
	}
}
