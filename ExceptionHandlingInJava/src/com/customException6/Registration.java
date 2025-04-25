package com.customException6;

import java.util.Scanner;

public class Registration {
	private static String[] users = new String[4];
	private static int count = 0;
	public static void register(String username)throws UserAlreadyExistsException
	{
		for(int i = 0;i<count;i++)
		{
			if(users[i].equals(username))
			{
				throw new UserAlreadyExistsException("user already exists in our database..");
			}
		}
		if(count < users.length)
		{
			users[count] = username;
			count++;
			System.out.println("User "+username+" Registered Successfully..");
		}
		else
		{
			System.out.println("Registration full.cannot register more users.");
		}
	}
	public static void main(String[] args) {
		System.out.println("main start..");
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the username -> ");
		Registration reg = new Registration();
		try {
			reg.register(in.next());
			reg.register(in.next());
			reg.register(in.next());
			reg.register(in.next());
			reg.register(in.next());
			reg.register(in.next());
			reg.register(in.next());
		}catch(UserAlreadyExistsException ex)
		{
			System.out.println(ex);
		}
	}
}
