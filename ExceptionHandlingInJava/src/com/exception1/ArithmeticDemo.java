package com.exception1;

public class ArithmeticDemo {
	public void demo()
	{
		int a = 2;
		int b = 0;
		try {
			int c = a/b;
			System.out.println(c);
		}catch(ArithmeticException ex)
		{
			ex.printStackTrace();
		}
	}
	public static void main(String[] args) {
		System.out.println("main starts.............");
		ArithmeticDemo ar = new ArithmeticDemo();
		ar.demo();
		System.out.println("main end.............");
	}
}
