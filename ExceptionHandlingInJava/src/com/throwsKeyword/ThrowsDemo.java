package com.throwsKeyword;

public class ThrowsDemo {
	public void m1()
	{
		System.out.println("Lemons");
		try {
			m2();	
		}catch(ArithmeticException ex)
		{
			System.out.println(ex);
		}
	}
	public void m2() throws ArithmeticException
	{
		System.out.println("Mangooo");
		m3();
	}
	public void m3() throws ArithmeticException
	{
		int a = 2;
		int b = 0;
		int c = a/b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		ThrowsDemo t1 = new ThrowsDemo();
		t1.m1();
	}
}
