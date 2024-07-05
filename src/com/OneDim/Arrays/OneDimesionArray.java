package com.OneDim.Arrays;

import java.util.Random;
import java.util.Scanner;

public class OneDimesionArray {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		
		System.out.println("Enter the length of array: ");
		int arr[] = new int[scan.nextInt()];
		
		scan.close();
		
		int len = arr.length;
		
		for(int i = 0 ; i <= len-1; i++) {
			arr[i] = random.nextInt();
		}
		for (int i : arr) {
			System.out.print(i + " ");
		}
		

	}

}
