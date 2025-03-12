package com.loopsHW;

public class Print11ToMinus33 {
	static void usingFor()
	{
		System.out.println("Using For loop");
		for(int num = 11; num>= -33;num-=4)
		{
			System.out.println("Num -> "+num);
		}
		System.out.println("=========================");
	}
	static void usingWhile()
	{
		int num = 11;
		System.out.println("Using While loop");
		while(num>=-33)
		{
			System.out.println("Num -> "+num);
			num-=4;
		}
		System.out.println("=========================");
	}
	static void usingDoWhile()
	{
		int num = 11;
		System.out.println("Using DoWhile loop");
		do
		{
			System.out.println("Num -> "+num);
			num-=4;
		}
		while(num>=-33);
		System.out.println("=========================");
	}
	public static void main(String[] args) {
		usingFor();
		usingWhile();
		usingDoWhile();
	}
}
