package com.exception1;

import java.util.Scanner;

public class ExceptionDemo2 {
	public void m1()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the value of a and b -> ");
		int a = in.nextInt();
		int b = in.nextInt();
		int c = a+b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		ExceptionDemo2 ex = new ExceptionDemo2();
		ex.m1();
	}
}
