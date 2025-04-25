package com.array;

import java.util.Scanner;

public class StringArray {
	static void acceptData(String[] arr)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the elements of array -> ");
		for(int k = 0; k<=arr.length-1;k++)
		{
			arr[k] = in.nextLine();
		}
	}
	static void showData(String[] arr)
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
		String[] arr = new String[size];
		StringArray.acceptData(arr);
		StringArray.showData(arr);
	}
}
