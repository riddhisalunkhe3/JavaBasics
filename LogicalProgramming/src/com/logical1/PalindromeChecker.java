package com.logical1;

import java.util.Scanner;

public class PalindromeChecker {
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
			int rev = 0;
			while(num>0)
			{
				rem = num%10;
				rev = (rev*10)+rem;
				num = num/10;
			}
			if(n == rev)
			{
				System.out.println(n+" is Palindrome...");
			}
			else
			{
				System.out.println(n+" is not Palindrome..");
			}
		}
	}
	public static void main(String[] args) {
		checker();
	}
}
