package com.array;

import java.util.Scanner;

public class IntArray {
	static void acceptData(int[] arr)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the elements of array -> ");
		for(int k = 0; k<=arr.length-1;k++)
		{
			arr[k] = in.nextInt();
		}
	}
	static void showData(int[] arr)
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
		int[] arr = new int[size];
		IntArray.acceptData(arr);
		IntArray.showData(arr);
	}
}
