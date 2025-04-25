package com.customException4;

import java.util.Scanner;

public class BankAccount {
	private static double balance;
	public BankAccount(double balance)
	{
		this.balance = balance;
	}
	public static void withdraw(double amount) throws InsufficientBalanceException
	{
		if(balance < amount)
		{
			throw new InsufficientBalanceException("Insufficient balance ");
		}
		else
		{
			balance = balance - amount;
		}
	}
	public static void checkBalance(double balance)
	{
		System.out.println("Remaining Balance = "+balance);
	}
	public static void main(String[] args) {
		System.out.println("main start..");
		BankAccount ba = new BankAccount(3000.45);
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the amount you want to withdraw -> ");
		try {
			double amount = in.nextDouble();
			withdraw(amount);
		}catch(InsufficientBalanceException ex)
		{
			System.out.println(ex);
		}
		ba.checkBalance(balance);
		System.out.println("main end..");
	}
}
