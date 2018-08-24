package com.pojo;

public class DemoPolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//superclass reference = object of subclass
		
		Person e= new Employee();
		//e.display(10);
		((Employee)e).display(10);
	}

}
