package com.apps;

import java.util.Scanner;

public class Pattern2 {
	public static void printPattern(int n) {
		for(int i=0; i<=n; i++) {
			for(int j=0; j<n-i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		System.out.println("Please Enter Number:");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		Pattern2.printPattern(n);
	}
}
