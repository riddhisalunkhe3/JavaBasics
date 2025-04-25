package com.exception1;

public class ExceptionDemo {
	public static void main(String[] args) {
		System.out.println("main method starts");
		try {
			System.out.println("------------");
			int a = 2;
			int b = 2;
			System.out.println(a);
			System.out.println(b);
			int c = a/b;
			System.out.println(c);
			System.out.println("++++++++++++");
		}catch(Exception ex)
		{
			System.out.println(ex);
		}
		try {
			String name = null;
			System.out.println(name);
			System.out.println("============");
			System.out.println(name.charAt(0));
		}catch(Exception ex)
		{
			System.out.println(ex);
		}
		System.out.println("main method ends");
	}
}
