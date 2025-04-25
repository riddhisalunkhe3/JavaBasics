package com.typecasting;
import java.util.Arrays;
import java.util.Scanner;

public class TypeCastingDemo {
      public static void main(String[] args) {
    	  Scanner r1 = new Scanner(System.in);
		byte a = 23;
		short b = 49;
		int c = 56;
		long d = 78;
		float e = 34.6f;
		double f = 46;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(e);
		System.out.println(f);
		
		System.out.println("-----------------------");
		f = a;
		System.out.println(f);
		f = b;
		System.out.println(f);
		f = c;
	    System.out.println(f);
		f = d;
		System.out.println(f);
		f = e;
		System.out.println(f);
		
		
		System.out.println("----------------------------------");
		
		a = (byte)a;
		System.out.println(a);
		a = (byte)b;
		System.out.println(a);
		a = (byte)c;
		System.out.println(a);
		a = (byte)d;
		System.out.println(a);
		a = (byte)e;
		System.out.println(a);
		a = (byte)f;
		System.out.println(a);
		
		System.out.println("----------------------------------");
		
		c = (int)c;
		System.out.println(c);
		c = (int)d;
		System.out.println(c);
		c = (int)e;
		System.out.println(c);
		c = (int)f;
		System.out.println(c);
		
		System.out.println("----------------------------------");
		
		int arr[] = new int[5];
		System.out.println("Enter the elements of array : ");
		for(int i = 0;i<arr.length;i++)
		{
			arr[i] = r1.nextInt();
		}
		System.out.println("Array is : "+Arrays.toString(arr));
	}
}
