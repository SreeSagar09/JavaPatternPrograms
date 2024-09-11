package com.apps;

import java.util.Scanner;

public class Pattern16 {
	public static void printPattern(int n) {
		for(int i=n; i>=0; i--) {
			for(int j=0; j<=n; j++) {
				int min = Math.min(i, j);
				int value = n-min;
				System.out.print(value+" ");
			}
			System.out.println("");
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter number");
		int n = scanner.nextInt();

		if(n>0) {
			printPattern(n);
		}else {
			System.out.println("Number should be greaterthan zero.");
		}
	}

}
