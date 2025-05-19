//Frequency of element k in arrays
package com.practise.Arrays;

import java.util.Scanner;

public class FrequencyInArray {
public static void main(String[] args) {
	System.out.println("Enter the size of an array");

	Scanner scn = new Scanner(System.in);
	
	int n = scn.nextInt();
	int arr[]= new int[n];
	
	for (int i = 0; i < arr.length; i++) {
		System.out.println("Enter the "+i+" th" +" "+ "Value for an array");

		arr[i]=scn.nextInt();
	}
	System.out.println("Enter the Element K whose frequency need to be check");
	int k = scn.nextInt();
	int frequency = 0;
	for (int i = 0; i < arr.length; i++) {
		
		if (arr[i]==k) {
			frequency++;
		}
	}
	System.out.println("The Frequency of element k in given array is " + frequency);

}

}
