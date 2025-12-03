package com.acharya.classes;
import java.util.Scanner;
public class MethodDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your Age : ");
		int age = sc.nextInt();
		boolean value=MethodDemo.canVote(age);
		if(value)
			System.out.println("can vote");
		else
			System.out.println("cannot vote");

	}
	public static boolean canVote(int age) {
		if (age>=18) {
			return true;
		}
		else {
			return false;
		}
	}

}
