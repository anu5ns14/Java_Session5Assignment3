package com.learning.exceptionHandling;

import java.util.Scanner;

public class ExceptionHandling {
	
	public static void main(String[] args) {
		
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the size of an array: ");
			int size = scan.nextInt();
			
			int arr[] = new int[size];
			System.out.println("Enter all the values into an array: ");
			
			for (int i = 0; i < arr.length; i++) {
				arr[i] = scan.nextInt();
			}
			
			System.out.println("");
			System.out.println("Printing Array: ");
			System.out.println("");
			
			for (int i = 0; i < (arr.length); i++) {
				
				System.out.print(arr[i]);
				System.out.print(" ");
				
			}
			
			System.out.println(arr[size]);
		}
		
		catch (ArrayIndexOutOfBoundsException e){
			System.out.println();
			System.out.println("Array is out of memory: "+e);
		}
		
		System.out.println("Exception is handled successfully");
		
	}
	
}
