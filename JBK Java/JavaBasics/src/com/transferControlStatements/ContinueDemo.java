package com.transferControlStatements;

public class ContinueDemo {
	public static void main(String[] args) {
		for(int k = 1; k<=50;k++)
		{
			if(k%3==0)
			{
				continue;
			}
			System.out.println(k);
		}
	}
}
