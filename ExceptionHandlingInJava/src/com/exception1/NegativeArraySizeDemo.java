package com.exception1;

import java.util.Scanner;

public class NegativeArraySizeDemo {
	public static void main(String[] args) {
		System.out.println("main start......");
		NegativeArraySizeDemo d1 = new NegativeArraySizeDemo();
		d1.m1();
		System.out.println("main end.....");
	}
	public void m1()
	{
		try {
			Scanner in = new Scanner(System.in);
			int[] arr = new int[-1];
		}catch(NegativeArraySizeException ex)
		{
			System.out.println(ex);
		}
	}
}
