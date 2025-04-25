package com.array;

import java.util.Scanner;

public class ByteArray {
	static void acceptData(byte[] b)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the elements of the array -> ");
		for(int k = 0;k<b.length;k++)
		{
			b[k] = in.nextByte();
		}
	}
	static void showData(byte[] b)
	{
		System.out.println("The Elements are -> ");
		for(int k = 0;k<=b.length-1;k++)
		{
			System.out.println(b[k]);
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size -> ");
		int size = in.nextInt();
		byte[] b = new byte[size];
		acceptData(b);
		showData(b);
	}
}
