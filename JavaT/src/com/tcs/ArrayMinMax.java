package com.tcs;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMinMax {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Size of Array -> ");
		int n = in.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the Elements of Array -> ");
		int i = 0;
		while(i<n)
		{
			arr[i] = in.nextInt();
			i++;
		}
		System.out.println(Arrays.toString(arr));
		int min = arr[0];
		for(int j = 0;j<n;j++)
		{
			if(min>arr[j])
			{
				min = arr[j];
			}
		}
		System.out.println("The Minimum Elements is : "+min);
		int sum = 0;
		for(int j = 0;j<arr.length;j++)
		{
			sum = sum + arr[j];
		}
		System.out.println("The sum of all elements is -> "+sum);
		int max = arr[0];
		for(int j = 0;j<arr.length;j++)
		{
			if(max<arr[j])
			{
				max = arr[j];
			}
		}
		System.out.println("The Max Element is -> "+max);
	}
}
