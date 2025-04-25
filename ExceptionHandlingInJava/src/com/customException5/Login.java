package com.customException5;

import java.util.Scanner;

public class Login {
	public static void setPassword(String password)throws PasswordTooShortException
	{
		if(password.length() < 8)
		{
			throw new PasswordTooShortException("Password should be greater than 8 characters..");
		}
		else
		{
			System.out.println("Password set successfully....");
		}
	}
	public static void main(String[] args) {
		System.out.println("main start ..");
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the password -> ");
		try {
			String password = in.next();
			setPassword(password);
		}catch(PasswordTooShortException ex)
		{
			System.out.println(ex);
		}
		System.out.println("main end...");
	}
}
