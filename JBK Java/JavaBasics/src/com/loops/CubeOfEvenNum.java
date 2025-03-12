package com.loops;

public class CubeOfEvenNum {
	public static void main(String[] args) {
		for(int num = 1;num<=10;num++)
		{
			if(num%2==0)
			{
				int cube = num*num*num;
				System.out.println("cube of "+num+" is "+cube);
			}
		}
	}
}
