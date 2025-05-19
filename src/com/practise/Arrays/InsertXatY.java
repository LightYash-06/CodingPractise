//Input N numbers array , a number x and number y from user , and insert y at x 


package com.practise.Arrays;

import java.util.Scanner;

public class InsertXatY {
	public static void main(String[] args) {
		
		System.out.println("Enter the size of an array");

		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		int arr[]= new int[n];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the "+i+" th" +" "+ "Value for an array");

			arr[i]=scn.nextInt();
		}
		System.out.println("Enter value for X :  ");
		int x = scn.nextInt();
		System.out.println("Enter value for y :  ");

		int y = scn.nextInt();
		
		//Create and array of size n+1 as we are adding 1 element at x position
		int arr1[]= new int[n+1];
		int Xindex = x;
		
		//copy content of part 1 from 0 to Xindex
		for (int i = 0; i < Xindex; i++) {
			arr1[i]=arr[i];
			
		}
		
		
		//Insert Element y at X th index
		arr[Xindex]=y;
		
		//Copy the remaining Content
		for (int i = Xindex+1; i < arr1.length; i++) {
			
			arr[i-1]=arr1[i];
		}
		for (int i = 0; i < arr1.length; i++) {
			
			System.out.println(arr1[i] + "");
		}
		
	}
	

}
