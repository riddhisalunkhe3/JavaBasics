package com.tcs;

import java.util.Scanner;

public class FibonacciNum {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number -> ");
		int num = in.nextInt();
		int n1 = 0;
		int n2 = 1;
		System.out.println(n1+"\n"+n2);
		for(int i = 1;i<=num;i++)
		{
			int n3 = n1 + n2;
			System.out.println(n3);
			n1 = n2;
			n2 = n3;
		}
	}
}
