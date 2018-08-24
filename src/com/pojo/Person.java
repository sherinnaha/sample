package com.pojo;

public class Person {

	private int age;
	private String name;
	public Person() {
		age=10;
		name="Sherin";
		// TODO Auto-generated constructor stub
	}

	public Person(int age,String name) {
		this.age=age;
		this.name=name;
		// TODO Auto-generated constructor stub
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}

	public void setName(String name) {
		this.name = name;
	}
	public void display() {
		System.out.println("name:"+name+" age:-"+age);
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Person p=(Person)obj;
		return (p.name.equals(name) && p.age==this.age);
	}
}



