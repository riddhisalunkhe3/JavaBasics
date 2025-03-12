package com.variables;

public class Variables {
	//instance variables
	int a = 10;
	int b = 31;
	//static variables
	static int c = 45;
	//final variables 
	final int d = 45;
	static void localMethods()
	{
		//local variables
		int a = 34;
		double b = 98.40;
		Variables var1 = new Variables();
		System.out.println(a);
		System.out.println(var1.a);
	}
	public static void main(String[] args) {
		Variables var = new Variables();
		System.out.println(c);
		System.out.println(var.a);
		System.out.println(var.b);
		System.out.println(var.d);
		localMethods();
	}
}
