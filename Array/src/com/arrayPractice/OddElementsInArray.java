package com.arrayPractice;

import java.util.Scanner;

public class OddElementsInArray {
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
	static void odd_elements(int[] arr)
	{
		for(int i = 0;i<arr.length;i++)
		{
			if(arr[i]%2 != 0)
			{
				System.out.print(arr[i]+" ");
			}
		}
	}
	public static void main(String[] args) {
		int[] arr = input_array();
		int n = arr.length;
		odd_elements(arr);
	}
}
