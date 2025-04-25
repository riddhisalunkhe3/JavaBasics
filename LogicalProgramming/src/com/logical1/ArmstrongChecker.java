package com.logical1;

import java.util.Scanner;

public class ArmstrongChecker {
	static void checker()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter lowerlimit and upperlimit -> ");
		int lowerLimit = in.nextInt();
		int upperLimit = in.nextInt();
		for(int i = lowerLimit;i<=upperLimit;i++)
		{
			int num = i;
			int n = num;
			int rem = 0;
			int sum = 0;
			int power = 0;
			int temp = 0;
			while(num>0)
			{
				num = num/10;
				power++;
			}
			num = n;
			while(num>0)
			{
				rem = num%10;
				temp = (int)Math.pow(rem, power);
				sum = sum + temp;
				num = num/10;
			}
			if(n == sum)
			{
				System.out.println(n+" is Armstrong number..");
			}
			else
			{
				System.out.println(n+" is not Armstrong number..");
			}
		}
	}
	public static void main(String[] args) {
		checker();
	}
}
