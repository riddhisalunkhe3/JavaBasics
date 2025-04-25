package com.exception1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchDemo {
	public static void main(String[] args) {
		System.out.println("main start.....");
		InputMismatchDemo i1 = new InputMismatchDemo();
		i1.m1();
		System.out.println("main end.........");
	}
	public void m1()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the value of a and b -> ");
		try {
			int a = in.nextInt();
			int b = in.nextInt();
			int c = a+b;
			System.out.println(c);
		}catch(InputMismatchException ex)
		{
			System.out.println(ex);
		}
	}
}
