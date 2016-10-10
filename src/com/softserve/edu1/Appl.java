package com.softserve.edu1;
public class Appl {

	public static void main(String[] args) {
		String text = "Hello World";
		System.out.println(text);
		Box box = new Box();
		//WrapperBox box = new WrapperBox();
		//Box2<String> box = new Box2<String>();
		box.setObject(text);
		Integer i = (Integer) box.getObject();
		System.out.println(i);
	}
	
}
