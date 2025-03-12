package com.Operators;

public class Operators {
	static void arithmeticOperators()
	{
		int a = 20; 
		double b = 10;
		double c = a + b;
		System.out.println("================= Arithmetic Operators ================");
		System.out.println(c);
		c = a - b;
		System.out.println(c);
		c = a * b;
		System.out.println(c);
		c = a / b;
		System.out.println(c);
		c = a % b;
		System.out.println(c);
		System.out.println("=======================================================");
	}
	
	static void relationalOperators()
	{
		int a = 50; 
		int b = 80;
		boolean c = a > b;
		System.out.println("================ Relational Operators =================");
		System.out.println(c);
		c = a < b;
		System.out.println(c);
		c = a <= b;
		System.out.println(c);
		c = a >= b;
		System.out.println(c);
		c = a == b;
		System.out.println(c);
		c = a != b;
		System.out.println(c);
		System.out.println("=======================================================");
	}
	
	static void logicalOperators()
	{
		int a = 30;
		int b = 50;
		boolean c = (a>b)&&(a<b);
		System.out.println("=================== Logical Operators ===================");
		System.out.println(c);
		c = (a==b)|| (a>b);
		System.out.println(c);
		c = !(a>b);
		System.out.println(c);
		System.out.println("=======================================================");
	}
	public static void main(String[] args) {
		arithmeticOperators();
		relationalOperators();
		logicalOperators();
	}
}
