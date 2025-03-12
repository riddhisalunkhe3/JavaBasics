package com.userInput;

import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the id : ");
		byte id = sc.nextByte();
		System.out.println("Enter the building No : ");
		short buildingNo = sc.nextShort();
		System.out.println("Enter the Mobile no :");
		int Mo_No = sc.nextInt();
		System.out.println("Enter the Aadhar card : ");
		long aadharCard_No = sc.nextLong();
		System.out.println("Enter the name : ");
		String name = sc.next();
		System.out.println("Enter the salary : ");
		float salary = sc.nextFloat();
		System.out.println("Enter the totalSalary : ");
		double totalSalary = sc.nextDouble();
	}
}
