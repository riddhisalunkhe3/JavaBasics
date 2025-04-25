package com.arrays;

import java.lang.reflect.Array;

public class MethodsInArray {
   public static void main(String[] args) {
	  int arr[] = {34,56,78,90,32,56};
	  System.out.println(arr.length);
	  
	  for(int i = 0;i<arr.length;i++)
	  {
		  System.out.println(arr[i]);
	  }
	  int arr1[] = arr.clone();
	   
	  System.out.println("==============================================");
	   
   Array.getInt(arr1 , 2);
   Array.setInt(arr1, 4, 99);
   for(int j = 0;j<arr1.length;j++)
	  {
		  System.out.println(arr1[j]);
	  }
}
}
