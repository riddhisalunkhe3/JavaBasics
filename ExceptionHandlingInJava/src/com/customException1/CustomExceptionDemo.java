package com.customException1;

import java.util.Scanner;

public class CustomExceptionDemo {
	public static void validateInput(int value) throws InvalidInputException
	{
		if(value < 0)
		{
			throw new InvalidInputException("Invalid valur : value cannot be negative..");
		}
		else
		{
			System.out.println("valid input : "+value);
		}
	}
	public static void main(String[] args) {
		System.out.println("main start......");
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the value -> ");
		try {
			int value = in.nextInt();
			validateInput(value);
		}catch(InvalidInputException ex)
		{
			System.out.println(ex);
		}
		System.out.println("main end...");
	}
}
