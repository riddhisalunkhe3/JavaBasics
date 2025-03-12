package com.controlStatementsInJava;

import java.util.Scanner;

public class ElseIfDemo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the num : ");
		int num = in.nextInt();
		if(num % 3 == 0 && num % 5 == 0)
		{
			System.out.println("Mango and Cherry");
		}
		else if(num % 3 == 0)
		{
			System.out.println("Mango");
		}
		else if(num % 5 == 0)
		{
			System.out.println("cherry");
		}
		else
		{
			System.out.println(num);
		}
	}
}
