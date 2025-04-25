package com.arrays;

public class DuplicateElements {
      public static void main(String[] args) {
		int arr[] = {23,45,67,23,89,45,90};
		//int arr1[] = arr.clone();
		int count = 0;
		for(int i =0;i<arr.length;i++)
		{
			//System.out.println(arr1[i]);
			for(int j = 0;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					 count++;
				}
			}
			if(count>=2)
			{
				System.out.println(arr[i]);
			}
			count = 0;
		}	
	}
}
