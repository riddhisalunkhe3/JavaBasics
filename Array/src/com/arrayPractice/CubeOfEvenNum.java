package com.arrayPractice;

import java.util.Scanner;

public class CubeOfEvenNum {
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
	static void cube_of_even_num(int[] arr)
	{
		for(int i = 0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				int cube = arr[i]*arr[i]*arr[i];
				System.out.println("The cube of "+arr[i]+" is "+cube);
			}
		}
	}
	public static void main(String[] args) {
		int[] arr = input_array();
		cube_of_even_num(arr);
	}
}
