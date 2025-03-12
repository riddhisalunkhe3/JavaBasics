package com.loopsHW;

public class PrintNumFrom55To88 {
	static void usingFor()
	{
		System.out.println("Using For loop");
		for(int num = 55; num<= 88;num+=3)
		{
			System.out.println("Num -> "+num);
		}
		System.out.println("=========================");
	}
	static void usingWhile()
	{
		int num = 55;
		System.out.println("Using While loop");
		while(num<=88)
		{
			System.out.println("Num -> "+num);
			num+=3;
		}
		System.out.println("=========================");
	}
	static void usingDoWhile()
	{
		int num = 55;
		System.out.println("Using DoWhile loop");
		do
		{
			System.out.println("Num -> "+num);
			num+=3;
		}
		while(num<=88);
		System.out.println("=========================");
	}
	public static void main(String[] args) {
		usingFor();
		usingWhile();
		usingDoWhile();
	}
}
