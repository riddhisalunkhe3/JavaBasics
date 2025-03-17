package com.loopsHW1303;
import java.util.Scanner;
public class NearestMultipleOfFive {
	 public static void main(String[] args)
     {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the number:");
	    int num=sc.nextInt();
	    int result = num - (num % 5);
	    System.out.println("Nearest Multiple of 5: " +result);
	 }
}
