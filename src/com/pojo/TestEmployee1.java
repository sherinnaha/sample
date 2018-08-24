package com.pojo;

public class TestEmployee1 extends Person {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1=new Person(12,"Sherin");
		Person p2=new Person(12,"Sherin");
	
	if(p1.equals(p2)) {
		System.out.println("yes");
	}
	else
		System.out.println("no");
	}
}
