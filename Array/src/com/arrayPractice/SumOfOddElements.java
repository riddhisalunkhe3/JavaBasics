package com.arrayPractice;

import java.util.Scanner;

public class SumOfOddElements {
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
	static void sum_of_Odd_num(int[] arr)
	{
		int sum = 0;
		for(int i = 0;i<arr.length;i++)
		{
			if(arr[i]%2!=0)
			{
				sum = sum + arr[i];
			}
		}
		System.out.println("The sum of odd numbers is -> "+sum);
	}
	public static void main(String[] args) {
		int[] arr = input_array();
		sum_of_Odd_num(arr);
	}
}
