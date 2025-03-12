package com.controlStatementsInJava;

import java.util.Scanner;

public class IfElseDemo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the num : ");
		int num = in.nextInt();
		if(num % 4 == 0 || num % 7 == 0)
		{
			System.out.println(num+" is divisible by 4 or 7 ");
		}
		else
		{
			System.out.println(num+" is not divisible by 4 or 7 ");
		}
	}
}
