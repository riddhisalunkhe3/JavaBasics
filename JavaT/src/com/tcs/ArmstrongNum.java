package com.tcs;

import java.util.Scanner;

public class ArmstrongNum {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the num -> ");
		int n = in.nextInt();
		for(int i = 1;i<=n;i++)
		{
			int num = i;
			int num2 = num;
			int sum = 0;
			int power = 0;
			int rem = 0;
			int temp = 0;
			while(num>0)
			{
				num = num/10;
				power++;
			}
			num = num2;
			while(num>0)
			{
				rem = num%10;
				temp = (int)Math.pow(rem, power);
				sum = sum + temp;
				num = num/10;
			}
			if(sum == num2)
			{
				System.out.println(num2+" is Armstrong number.");
			}
			else
			{
				System.out.println(num2+" is not Armstrong number.");
			}
		}
	}
}
