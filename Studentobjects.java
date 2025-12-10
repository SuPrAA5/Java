package com.acharya.classes;

import java.util.*;

public class Studentobjects {
	String name;
	int age;
	double marks;

	public Studentobjects(String name,int age,double marks){
		this.name=name;
		this.age=age;
		this.marks=marks;
	}

	public String toString() {
		return "Name:"+name+"Age:"+age+"Marks:"+marks;
	}


	
		public static void main(String[] args) {
			Scanner sc=new Scanner (System.in);
			
			int size = 3;
			Studentobjects stud[] = new Studentobjects[size];
			
			for(int i=0; i<size; i++) {
				System.out.println("Enetr details for Students"+(i+1)+":");
				System.out.print("Name : ");
				String Name = sc.next();
				
				System.out.print("Age : ");
				int Age = sc.nextInt();
				
				System.out.print("Marks : ");
				double Marks = sc.nextDouble();
				
				stud[i]=new Studentobjects(Name,Age,Marks);
				
			}
			System.out.println("\n Student Details");
			for(int i=0;i<size;i++) {
				System.out.println(stud[i]);
				
			}
			sc.close();

	}

}
