package com.tcs;

public class RemoveDuplicatesFromArray {
	public static void main(String[] args) {
		int[] arr = {34,56,78,99,64,22,34};
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
