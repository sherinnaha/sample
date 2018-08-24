package com.myabastract;

abstract public class Shape{
	public Shape() {
		name="no name";
	}
	public String name;
	public Shape(String name) {
		this.name=name;
	}
	public void description() {
		System.out.println(name);
	}

	abstract public double area();
}
