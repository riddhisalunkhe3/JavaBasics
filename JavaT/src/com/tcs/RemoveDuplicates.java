package com.tcs;

public class RemoveDuplicates {
	public static void main(String[] args) {
		int[] arr = {56,78,56,76,98,76,89,99,88,89,89};
		int n = arr.length;
		for(int i = 0;i<n;i++)
		{
			boolean duplicate = false;
			for(int j = 0;j<i;j++)
			{
				if(arr[i]==arr[j])
				{
					duplicate = true;
					break;
				}
			}
			if(!duplicate)
			{
				System.out.print(arr[i]+" ");
			}
		}
	}
}
