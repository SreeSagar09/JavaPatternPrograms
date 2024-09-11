package com.apps;

import java.util.Scanner;

public class Pattern17 {
	public static void printPattern(int n) {
		for(int i=0; i<=n; i++) {
			for(int j=0; j<=n; j++) {
				int min = Math.min(Math.min(i, j), Math.min(n-i, n-j));
				System.out.print(min+" ");
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
