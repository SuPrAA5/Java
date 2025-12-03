package com.acharya.classes;
import java.util.Scanner;
public class Time {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter from 1 to 24:");
		int time=sc.nextInt();
		String value=Time.printTime(time);
		if(value.equals("AM")){
			System.out.println("its Morning");
		}else {
			System.out.println("its Evening");
		}
	}
public static String  printTime(int time) {
	if(time>=0 && time < 12) {
		return "AM";
	}
	else if(time>=12 && time<=24){
		return "PM";
		
	}else {
		return "null";
	}
}
}
