package com.arrays;
import java.util.*;
import java.util.Arrays;
public class ArraysDemo {
      public static void main(String[] args) {
    	  Scanner r = new Scanner(System.in);
		int a[] = {2,3,4,5,6,7,};
		int b[] = new int[5];
		System.out.println(Arrays.toString(a));
		System.out.println(a.length);
		System.out.println("Enter the elements of array : ");
		for(int i = 0;i<b.length;i++)
		{
			b[i] = r.nextInt();
			 
		}
		 System.out.println(Arrays.toString(b));
 	}
}
