package com.programs;

public class Practice1 {
	public static void main(String[] args) {
		int num = 121;
		int n = num;
		int rem = 0;
		int rev = 0;
		while(num > 0)
		{
			rem = num%10;
			rev = (rev*10)+rem;
			num = num/10;
		}
		if(n == rev)
		{
			System.out.println(n+" is palindrome.");
		}
		else
		{
			System.out.println(n+" is not palindrome.");
		}
	}
}
