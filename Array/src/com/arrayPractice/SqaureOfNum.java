package com.arrayPractice;

import java.util.Scanner;

public class SqaureOfNum {
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
	static void square_of_num(int[] arr)
	{
		for(int i = 0;i<arr.length;i++)
		{
			int square = arr[i]*arr[i];
			System.out.println("The square of "+arr[i]+" is "+square);
		}
	}
	public static void main(String[] args) {
		int[] arr = input_array();
		square_of_num(arr);
	}
}
