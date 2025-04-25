package com.array;

import java.util.Scanner;

public class DoubleArray {
	static void acceptData(double[] arr)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the elements of array -> ");
		for(int k = 0; k<=arr.length-1;k++)
		{
			arr[k] = in.nextDouble();
		}
	}
	static void showData(double[] arr)
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
		double[] arr = new double[size];
		DoubleArray.acceptData(arr);
		DoubleArray.showData(arr);
	}
}
