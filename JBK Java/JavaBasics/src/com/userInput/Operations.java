package com.userInput;

import java.util.Scanner;

public class Operations {
	static Scanner sc = new Scanner(System.in);
	static void  sum()
	{
		System.out.println("Enter the Two numbers : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a + b;
		System.out.println(c);
	}
	static void sub()
	{
		System.out.println("Enter the Two numbers : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a - b;
		System.out.println(c);
	}
	static void mul()
	{
		System.out.println("Enter the Two numbers : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a * b;
		System.out.println(c);
	}
	static void div()
	{
		System.out.println("Enter the Two numbers : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a / b;
		System.out.println(c);
	}
	static void mod()
	{
		System.out.println("Enter the Two numbers : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a % b;
		System.out.println(c);
	}
	static void average()
	{
		System.out.println("Enter the Three numbers : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int total = a+b+c;
		int avg = total/3;
		System.out.println("Average of three numbers : "+avg);
	}
	public static void main(String[] args) {
//		sum();
//		sub();
//		mul();
//		div();
//		mod();
		average();
	}
}
