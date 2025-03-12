package com.userInput;

import java.util.Scanner;

public class AreaOfSquare {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of side : ");
		double side = sc.nextDouble();
		double area = side*side;
		System.out.println("The area of sqaure is : "+area);
	}
}
