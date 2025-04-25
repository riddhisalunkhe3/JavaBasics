package com.arrays;

public class PercentageArray {
    public static void main(String[] args) {
		int arr[] = {67,89,78,90,76};
		int total = 0;
		for(int i = 0;i<arr.length;i++)
		{
			 
		    total = total + arr[i]; 
		}
		double per = total/arr.length;
		System.out.println("Peracentage = "+per);
	}
}
