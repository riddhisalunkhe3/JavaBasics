package com.logical1;

import java.util.Scanner;

public class Fibonnacci {
	static void fibonacci()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the upperlimit -> ");
		int upperLimit = in.nextInt();
		int n1 = 0;
		int n2 = 1;
		System.out.print(n1+" ");
		for(int i = 1;i<=upperLimit;i++)
		{
			int n3 = n1 + n2;
			System.out.print(n3+" ");
			n1 = n2;
			n2 = n3;
		}
	}
	public static void main(String[] args) {
		fibonacci();
	}
}
