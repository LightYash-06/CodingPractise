package com.practise.Arrays;

import java.util.Iterator;
import java.util.Scanner;

public class BasicArrrays {
	
    public static void main(String[] args) {
    	//Take input from user
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n = scn.nextInt();
		//construct an array
		int arr[] = new int[n];
		//populate the array
		for (int i = 0; i < arr.length; i++) {
			
			System.out.println("Enter the "+i+" th" +""+ "Value for an array");
			
			arr[i]=scn.nextInt();
			
		}
		//print the array
		System.out.println("The given array is : ");
		for (int i = 0; i < arr.length; i++) {
		
			System.out.print(arr[i] + "    ");
			
		}
		//print the  Reverse array
		System.out.println("The given array in reverse  is : ");
		for (int i = arr.length-1; i >=0; i--) {
		
			System.out.print(arr[i] + "    ");
			
		}
		
	}

}
