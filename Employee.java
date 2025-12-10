package com.acharya.classes;

public class Employee {
	int id;
	String name ;
	double salary;
public Employee(int id,String name,double salary){
	 this.id = id;
	 this.name = name;
	this.salary = salary;
}
	public void getSalary() {
		System.out.println("The Salary is " + salary);
	}

	public void getName() {
		System.out.println("The name is " + name);
	}

	public static void main(String args[]) {
		Employee emp1 = new Employee(12,"trial",3200.0);
		
		System.out.println("The id is "+emp1.id);
		emp1.getSalary();
		emp1.getName();
		Employee emp2 = new Employee(13,"suprith",10000.0);
		System.out.println("The id is "+emp2.id);
		emp2.getSalary();
		emp2.getName();
	}
}
