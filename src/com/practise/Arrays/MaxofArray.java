package com.practise.Arrays;

import java.util.Scanner;

public class MaxofArray {

	public static void main(String[] args) {
		System.out.println("Enter the size of an array");

		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		int arr[]= new int[n];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the "+i+" th" +""+ "Value for an array");

			arr[i]=scn.nextInt();
		}
		int max = arr[0];
		int min=  arr[0];
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i]>max) {
				
				max = arr[i];
				
			}
		}
		for (int i = 0; i < arr.length; i++)
		{
			
			if (arr[i]<min)
			{
				
				min = arr[i];
				
			}
		}
		
		
		System.out.println("Maximum Element in an array is :" + max);
		System.out.println("Minimum Element in an array is :" + min);

		
	}
	
}
