package com.practise.Arrays;

import java.util.Scanner;

public class ArrayPairs {
	
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
		System.out.println("Enter the value for k to check sum pairs");
		int k = scn.nextInt();
		int pairs = 0;
		for (int i = 0; i < arr.length; i++) {
			//initializing with i+1 to skip same indices like (1,1) (2,2) etc 
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]+arr[j]==k) {
					
					pairs++;
				}
				
			}
		}
		System.out.println("Number of pairs that make sum as k are : "+pairs);
	}
	

}
