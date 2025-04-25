package com.arrayPractice;

import java.util.Scanner;

public class AcceptEvenElementsInArray {
	static Scanner in = new Scanner(System.in);
	static int[] input_array()
	{
		System.out.println("Enter the size of the array -> ");
		int size = in.nextInt();
		int[] arr = new int[size];
		int count = arr.length;
		System.out.println("Enter the elements of array -> ");
		while(count == size)
		{
			for(int i = 0;i<arr.length;i++)
			{
				int num = in.nextInt();
				if(num%2==0)
				{
					arr[i] = num;
					count++;
				}
			}
		}
		return arr;
	}
	static void print_array()
	{
		int[] arr = input_array();
		for(int i = 0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		print_array();
	}
}
