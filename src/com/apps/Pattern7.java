package com.apps;

import java.util.Scanner;

public class Pattern7 {
	public static void printPattern1(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i == 1 || j == 1) {
					System.out.print("* ");
				}else {
					//To avoid unnecessary loop execution.
					break;
				}
			}
			System.out.println("");
		}
	}
	
	public static void printPattern2(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i == n || j == n) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println("");
		}
	}
	
	public static void printPattern3(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i == n || j == 1) {
					System.out.print("* ");
				}else {
					//To avoid unnecessary loop execution.
					break;
				}
			}
			System.out.println("");
		}
	}
	
	public static void printPattern4(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i == 1 || j == n) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println("");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Please Enter Number:");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println("First Pattern");
		Pattern7.printPattern1(n);
		System.out.println("Second Pattern");
		Pattern7.printPattern2(n);
		System.out.println("Third Pattern");
		Pattern7.printPattern3(n);
		System.out.println("Fourth Pattern");
		Pattern7.printPattern4(n);
	}

}
