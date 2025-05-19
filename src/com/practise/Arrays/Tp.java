package com.practise.Arrays;

public class Tp {
	
	public static void main(String[] args) {
		print(1);
	}

	 static void print(int i) {
		// TODO Auto-generated method stub
		 if (i>=6) {
			return;
		}
		System.out.println(i);
		print(i+1);
	}

}
