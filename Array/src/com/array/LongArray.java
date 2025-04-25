package com.array;

import java.util.Scanner;

public class LongArray {
	static void acceptData(long[] arr)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the elements of array -> ");
		for(int k = 0; k<=arr.length-1;k++)
		{
			arr[k] = in.nextLong();
		}
	}
	static void showData(long[] arr)
	{
		System.out.println("The Elements are -> ");
		for(int k = 0;k<=arr.length-1;k++)
		{
			System.out.println(arr[k]);
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size -> ");
		int size = in.nextInt();
		long[] arr = new long[size];
		LongArray.acceptData(arr);
		LongArray.showData(arr);
	}
}
