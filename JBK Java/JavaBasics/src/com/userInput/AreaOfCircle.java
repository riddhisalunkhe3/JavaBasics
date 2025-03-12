package com.userInput;

import java.util.Scanner;

public class AreaOfCircle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of radius : ");
		double r = sc.nextDouble();
		double pie = 3.14;
		double area = pie*r*r;
		System.out.println("Area of circle is : "+ area);
	}
}
