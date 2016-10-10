package com.softserve.edu1;

public class WrapperBox {
	
	private Box box = new Box();

	public void setObject(String text) {
		this.box.setObject(text);
	}

	public String getObject() {
		return (String) box.getObject();
	}
	
}
