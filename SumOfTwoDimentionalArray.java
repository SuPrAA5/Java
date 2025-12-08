package com.acharya.classes;
import java.util.*;
public class SumOfTwoDimentionalArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[][] = new int[2][3];
		for (int i=0; i < arr.length; i++) {
			for (int j=0;j < arr[i].length; j++) {
				System.out.println("Enter the value for row:" +(i+1)+" and column "+(j+1));
				arr[i][j] = sc.nextInt();
			}
		}
		int sum=0;
		for(int i=0; i<2; i++) {
			for(int j=0;j<3;j++) {
				sum=sum+arr[i][j];
			}
		}
		System.out.print("sum of all matrix no:"+sum);
	}
}



