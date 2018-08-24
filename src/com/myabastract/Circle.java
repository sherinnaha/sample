package com.myabastract;

public class Circle extends Shape {

	private int radius;
	public Circle(int i, String name) {
		super(name);
		this.radius=i;
	}
	
	/*public Circle(int radius,String name) {
		// TODO Auto-generated method stub
		super(name);
		this.radius=radius; 
	}*/

	

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return (3.14*radius*radius);
	}
}
            