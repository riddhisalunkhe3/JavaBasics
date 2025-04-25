package com.logical1;

import java.util.Scanner;

public class ReverseNum {
	static void revNum()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the num -> ");
		int num = in.nextInt();
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
			System.out.println(n+" is reverse number.");
		}
		else
		{
			System.out.println(n+" is not reverse number.");
		}
	}
	public static void main(String[] args) {
		revNum();
	}
}
