package com.pojo;

public class Employee extends Person{

	private double empSalary;
	private int empId;
	public Employee() {
		super();
		empId=0;
		empSalary=1000d;
		// TODO Auto-generated constructor stub
	}
	public Employee(int empId, double empSalary , int age, String name) {
		super(age,name);
		this.empId=empId;
		this.empSalary=empSalary;
	}

	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public void display(int x) {
		super.display();
		System.out.println("empId:-"+empId+" empSalary:-"+empSalary);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		return empId+" "+empSalary+ super.toString();
	}
	/*@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Person p=(Person)obj;
		return super.equals(obj);
	} */	
}
