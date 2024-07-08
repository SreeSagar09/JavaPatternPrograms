package com.apps;

import java.util.Scanner;

public class Pattern9 {
	public static void printPattern1(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=(n-i+1); j++) {
				System.out.print(j+" ");
			}
			System.out.println("");
		}
	}
	
	public static void printPattern2(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=(n-i+1); j++) {
				System.out.print(i+" ");
			}
			System.out.println("");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Please Enter Number:");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println("First Pattern");
		Pattern9.printPattern1(n);
		System.out.println("Second Pattern");
		Pattern9.printPattern2(n);
	}
}
