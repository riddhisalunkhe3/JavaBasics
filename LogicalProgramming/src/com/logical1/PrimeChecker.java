package com.logical1;

import java.util.Scanner;

public class PrimeChecker {
	static void checker()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter lowerlimit and upperlimit -> ");
		int lowerLimit = in.nextInt();
		int upperLimit = in.nextInt();
		for(int i = lowerLimit;i<=upperLimit;i++)
		{
			int num = i;
			int count = 0;
			for(int j = 1;j<=num;j++)
			{
				if(num%j==0)
				{
					count++;
				}
			}
			if(count == 2)
			{
				System.out.println(num+" is Prime number..");
			}
			else
			{
				System.out.println(num+" is not Prime number..");
			}
		}
	}
	public static void main(String[] args) {
		checker();
	}
}
