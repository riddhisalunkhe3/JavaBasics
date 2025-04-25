package com.tcs;

import java.util.Scanner;

public class PalindromeNumPractice {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the n : ");
		int n = in.nextInt();
		for(int i = 1;i<=n;i++)
		{
			int num = i;
			int num2 = num;
			int temp = 0;
			int rem = 0;
			while(num>0)
			{
				rem = num%10;
				temp = (temp*10)+rem;
				num = num/10;
			}
			if(temp == num2)
			{
				System.err.println(num2+" is palindrome number.");
			}
			else
			{
				System.out.println(num2+" is not Palindrome Number.");
			}
		}
	}
}
