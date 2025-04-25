package com.customException2;

import java.util.Scanner;

public class CustomExceptionDemo {
	public static void validateAge(int age) throws InvalidAgeForVotingException
	{
		if(age < 18)
		{
			throw new InvalidAgeForVotingException("Invalid age : You are not eligible for voting..");
		}
		else
		{
			System.out.println("You are eligible for voting..");
		}
	}
	public static void main(String[] args) {
		System.out.println("main start ...");
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the age -> ");
		try {
			int age = in.nextInt();
			validateAge(age);
		}catch(InvalidAgeForVotingException ex)
		{
			System.out.println(ex);
		}
		System.out.println("main end...");
	}
}
