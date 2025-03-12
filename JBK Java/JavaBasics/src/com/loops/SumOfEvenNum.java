package com.loops;

public class SumOfEvenNum {
	public static void main(String[] args) {
		int sum = 0;
		for(int num = 1;num<=10;num++)
		{
			if(num%2==0)
			{
				sum = sum + num;
			}
		}
		System.out.println("Sum of even num between 1 to 10 "+sum);
	}
}
