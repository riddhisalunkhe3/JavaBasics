package com.tcs;

import java.util.Scanner;

public class ReverseNum {
	public static void main(String[] args) {
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
		System.out.println("The reverse number of "+n+" is "+rev);
	}
}
