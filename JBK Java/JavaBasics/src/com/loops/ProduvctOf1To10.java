package com.loops;

public class ProduvctOf1To10 {
	public static void main(String[] args) {
		int product = 1;
		for(int num = 1;num<=10;num++)
		{
			product = product*num;
		}
		System.out.println("Product of 1 to 10 "+product);
	}
}
