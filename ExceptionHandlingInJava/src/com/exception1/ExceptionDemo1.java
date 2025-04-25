package com.exception1;

public class ExceptionDemo1 {
	static void arrayException()
	{
		System.out.println("arrayException Method start");
		int[] arr = {2,3,3,5,6};
		try {
			System.out.println(arr[6]);
		}catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println(ex);
		}
		System.out.println("arrayException method end");
	}
	static void stringException()
	{
		System.out.println("stringException method start");
		String name = "Riddhi";
		try {
			System.out.println(name.charAt(6));
		}catch(StringIndexOutOfBoundsException ex)
		{
			System.out.println(ex);
		}
		System.out.println("stringException method end");
	}
	static void nullpointerException()
	{
		System.out.println("nullpointerException method start");
		String name = null;
		try {
			System.out.println(name.charAt(0));
		}catch(NullPointerException ex)
		{
			System.out.println(ex);
		}
		System.out.println("nullpointerException method end");
	}
	static void arithmeticException()
	{
		System.out.println("arithmeticException method start");
		try {
			int a = 2;
			int b = 0;
			int c = a/b;
			System.out.println(c);
		}catch(ArithmeticException ex)
		{
			System.out.println(ex);
		}
		System.out.println("arithmeticException method end");
	}
	public static void main(String[] args) {
		arrayException();
		System.out.println();
		System.out.println("==========================");
		stringException();
		System.out.println();
		System.out.println("==========================");
		nullpointerException();
		System.out.println();
		System.out.println("==========================");
		arithmeticException();
	}
}
