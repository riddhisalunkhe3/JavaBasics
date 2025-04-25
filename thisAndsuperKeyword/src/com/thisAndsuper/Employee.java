package com.thisAndsuper;

import java.util.Scanner;

public class Employee extends Company{
	Scanner in = new Scanner(System.in);
	private int empID;
	private double empSalary;
	private String designation;
	
	public Employee(int empID, double empSalary, String designation) {
		super();
		this.empID = empID;
		this.empSalary = empSalary;
		this.designation = designation;
	}
	public Employee() {
		super();
	}
	public Employee(String companyName, String companyLocation) {
		super(companyName, companyLocation);
	}
	public void displayDetails()
	{
		System.out.println("Id -> "+empID+" employeeSalary -> "+empSalary+" designation -> "+designation);
	}
}
