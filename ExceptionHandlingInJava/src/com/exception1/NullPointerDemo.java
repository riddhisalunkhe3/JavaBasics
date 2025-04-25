package com.exception1;

public class NullPointerDemo {
	public static void main(String[] args) {
		System.out.println("main start........");
		NullPointerDemo n1 = new NullPointerDemo();
		n1.m1();
		System.out.println("main end........");
	}
	public void m1()
	{
		System.out.println("Mango");
		m2();
	}
	public void m2()
	{
		System.out.println("Apple");
		try
		{
			m3();
		}catch(NullPointerException ex)
		{
			System.out.println(ex);
		}
		
	}
	public void m3()throws NullPointerException
	{
		String name = null;
		System.out.println(name.charAt(0));
	}
}
