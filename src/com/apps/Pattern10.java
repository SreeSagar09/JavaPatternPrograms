package com.apps;

import java.util.Scanner;

public class Pattern10 {
	public static void printPattern(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if((i+j-1)<=n) {
					System.out.print((i+j-1)+" ");
				}else {
					System.out.print((i+j-1-n)+" ");
				}
			}
			System.out.println("");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Please Enter Number:");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		printPattern(n);
	}
}
