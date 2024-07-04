package com.apps;

import java.util.Scanner;

public class Pattern4 {
	public static void printPattern(int n) {
		for(int i=0; i<=n; i++) {
			for(int j=0; j<=n; j++) {
				if(n-i>=n-j) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Please Enter Number:");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		Pattern4.printPattern(n);
	}
}
