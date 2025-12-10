package com.acharya.classes;
import java.util.*;

public class CheckingArrays {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
		int[][] arr = new int[3][3];
		int count1 = 0;
		int count2 = 0;
		int count3= 0;
		
		System.out.println("Enetr 9 numbers for 3x3 array:");
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				arr[i][j]=sc.nextInt();
				
				if(arr[i][j]>=1 && arr[i][j]<=50) {
					count1++;
				}else if(arr[i][j]>=50 && arr[i][j]<=100) {
					count2++;
				}else if(arr[i][j]>100) {
					count3++;
				}
			}
		}
		System.out.println("No between 1 to 50:"+count1);
		System.out.println("No between 51 to 100:"+count2);
		System.out.println("No above 100:"+count3);
		sc.close();
	}

}
