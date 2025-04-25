package com.array;

import java.util.Scanner;

public class FloatArray {
	static void acceptData(float[] arr)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the elements of array -> ");
		for(int k = 0; k<=arr.length-1;k++)
		{
			arr[k] = in.nextFloat();
		}
	}
	static void showData(float[] arr)
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
		float[] arr = new float[size];
		FloatArray.acceptData(arr);
		FloatArray.showData(arr);
	}
}
