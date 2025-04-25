package com.tcs;

import java.util.Scanner;

public class PalindromeNum {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the value of n : ");
		int n = in.nextInt();
		for(int i = 1;i<=n;i++)
		{
			int num = i;
			int num1 = num;
			int num2 = 0;
			int temp = 0;
			int rem = 0;
			while(num>0)
			{
				rem = num % 10;//1
				num2 = (num2*10)+rem;//
				num = num/10;
			}
			if(num2 == num1 )
			{
				System.out.println(num1+" is Palindrome number.");
			}
			else
			{
				System.out.println(num1+" is not Palindrome number.");
			}
		}
	}
}
