//Sum of all Elements in an given array
package com.practise.Arrays;

import java.util.Scanner;

public class SumofAnGivenArray {
	
	public static void main(String[] args) {
		System.out.println("Enter the size of an array");

		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		int arr[]= new int[n];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the "+i+" th" +""+ "Value for an array");

			arr[i]=scn.nextInt();
		}
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = arr[i]+sum;
		}
		System.out.println("Sum of all the Elements in an given array is : "+sum);
		
		 long product =1;
		 for (int i = 0; i < arr.length; i++) {
			 
			 product= arr[i]*product;
			
		}
		System.out.println("product of all the elements in given array is : "+product);
	}
        
}
