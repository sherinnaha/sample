package com.pojo;
import java.util.Scanner;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Scanner s = new Scanner(System.in);
		
		System.out.println("enter the age of employee");
		int age= s.nextInt();
		System.out.println("enter the name of employee");
		s.next();
		String name= s.nextLine();
		System.out.println("enter the empId of employee");
		int empId= s.nextInt();
		System.out.println("enter the salary of employee");
		double sal= s.nextDouble();


		Employee emp=new Employee(empId,sal,age,name);
		emp.display();
		int a =emp.getAge();
		String n=emp.getName();
		//System.out.println("name:-"+n+" age:-"+a);
		*/
		Employee emp=new Employee(123,120d,22,"Sherin");
		System.out.println(emp);
		
	}

}
