package com.practise.Arrays;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] a = new int[n];

        // Input array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // Input b and c
        System.out.println("Enter index b (start of reverse):");
        int b = sc.nextInt();
        System.out.println("Enter index c (end of reverse):");
        int c = sc.nextInt();

        // Validate indices
        if (b < 0 || c >= n || b > c) {
            System.out.println("Invalid indices. Make sure 0 <= b <= c < n.");
            return;
        }

        // Reverse the subarray from b to c
        while (b < c) {
            int temp = a[b];
            a[b] = a[c];
            a[c] = temp;
            b++;
            c--;
        }

        // Print the modified array
        System.out.println("Array after reversing from b to c:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
