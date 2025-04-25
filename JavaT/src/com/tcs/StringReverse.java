package com.tcs;

import java.util.Scanner;

public class StringReverse {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the String -> ");
		String str = in.next();
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println("The size of the given string is -> "+str.length());
		int count = 0;
		for(int i = 0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if((ch == 'a'|| ch == 'e'|| ch == 'i'|| ch == 'o'|| ch == 'u')||(ch == 'A'|| ch == 'E'|| ch == 'I'|| ch == 'O'|| ch == 'U'))
			{
				count++;
			}
		}
		System.out.println("The no.of vowels present in given string are -> "+count);
		String str2 ="";
		for(int i = str.length()-1;i>=0;i--)
		{
			str2 = str2+str.charAt(i);
		}
		if(str2.equals(str))
		{
			System.out.println("The string is palindrome ");
		}
		else
		{
			System.out.println("The string is not palindrome ");
		}
	}
}
