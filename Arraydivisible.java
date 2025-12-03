package com.acharya.classes;
import java.util.*;
public class Arraydivisible {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the range:");
		int n=sc.nextInt();
		int arr[]=new int[n];
	
		System.out.println("Enter elements:");
		int count=0;
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			if(arr[i] % 3 == 0) {
				count++;
			}
			
		}
		System.out.println("Number of elements exactly divisible by 3:"+count);

	}
	


	
	}


