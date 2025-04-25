package com.exception1;

public class ArrayIndexDEmo {
	public static void main(String[] args) {
		System.out.println("main start.......");
		ArrayIndexDEmo ar = new ArrayIndexDEmo();
		ar.m1();
		System.out.println("main end.........");
	}
	public void m1()
	{
		try {
			int[] arr = new int[2];
			System.out.println(arr[3]);
		}catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println(ex);
		}
	}
}
