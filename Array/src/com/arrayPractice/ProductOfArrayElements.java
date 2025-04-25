package com.arrayPractice;

import java.util.Scanner;

public class ProductOfArrayElements {
	static Scanner in = new Scanner(System.in);
	static int[] input_array()
	{
		System.out.println("Enter the size -> ");
		int size = in.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the elements of array -> ");
		for(int i = 0;i<arr.length;i++)
		{
			arr[i] = in.nextInt();
		}
		return arr;
	}
	static void product_of_num(int[] arr)
	{
		int product = 1;
		for(int i = 0;i<arr.length;i++)
		{
			product = product*arr[i];
		}
		System.out.println("The product of numbers is -> "+product);
	}
	public static void main(String[] args) {
		int[] arr = input_array();
		product_of_num(arr);
	}
}
