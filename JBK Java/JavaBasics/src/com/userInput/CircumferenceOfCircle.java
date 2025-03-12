package com.userInput;

import java.util.Scanner;

public class CircumferenceOfCircle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Radius : ");
		double rad = sc.nextDouble();
		double pie = 3.14;
		double circumference = 2*pie*rad;
		System.out.println("The circumference of circle is : "+circumference);
	}
}
