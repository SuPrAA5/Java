package com.acharya.classs;
import java.util.*;
public class Arraysub {

	public static void main(String[] args) {
		int arr1[]= {12,13,24,53};
		System.out.println("enter your start index");
	    Scanner sc=new Scanner(System.in);
	    int sindex=sc.nextInt();
	    System.out.println("enter your end index");
	    
	    int eindex=sc.nextInt();
	    
	    Arraysub.subArray(arr,sindex,eindex);

	}

	public static int subArray(int myarr[],int sindex,int eindex) {
		for (int i = eindex; i <eindex; i++) {
			System.out.println(myarr[i]);

		}
		return 0;
	}

}

