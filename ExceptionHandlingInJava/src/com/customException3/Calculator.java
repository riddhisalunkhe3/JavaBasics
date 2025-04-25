package com.customException3;

import java.util.Scanner;

public class Calculator {
	public static void divide(int a, int b)throws DivideByZeroException
	{
		if(b == 0)
		{
			throw new DivideByZeroException("Can't divide by zero");
		}
		else
		{
			int c = a/b;
			System.out.println("value of c -> "+c);
		}
	}
	public static void main(String[] args) {
		System.out.println("main start..");
		Scanner in = new Scanner(System.in);
		System.out.println("enter the value of a and b -> ");
		try {
			int a = in.nextInt();
			int b = in.nextInt();
			divide(a,b);
		}catch(DivideByZeroException ex)
		{
			System.out.println(ex);
		}
		System.out.println("main end...");
	}
}
