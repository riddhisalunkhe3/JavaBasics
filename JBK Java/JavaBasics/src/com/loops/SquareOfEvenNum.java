package com.loops;

public class SquareOfEvenNum {
	public static void main(String[] args) {
		for(int num = 1;num<=10;num++)
		{
			if(num%2==0)
			{
				int square = num*num;
				System.out.println("Square of "+num+" is "+square);
			}
		}
	}
}
