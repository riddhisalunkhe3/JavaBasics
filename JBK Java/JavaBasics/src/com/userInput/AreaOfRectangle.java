package com.userInput;

import java.util.Scanner;

public class AreaOfRectangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length and breadth : ");
		double length = sc.nextDouble();
		double breadth = sc.nextDouble();
		double area = length*breadth;
		System.out.println("The area of Rectangle : "+area);
	}
}
