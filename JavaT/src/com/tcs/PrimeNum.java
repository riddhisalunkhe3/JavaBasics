package com.tcs;

import java.util.Scanner;

public class PrimeNum {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the num : ");
		int num = in.nextInt();
		int count = 0;
		for(int i = 1;i<=num;i++)
		{
			 
			if(num%i == 0)
			{
				count++;
			}
		}
		if(count == 2)
		{
			System.out.println(num+" is Prime number.");
		}
		else
		{
			System.out.println(num+" is not Prime number.");
		}
	}
}
