package com.thisAndsuper;

import java.util.Scanner;

public class EmployeeController {
	public void accept(Employee[] emp)
	{
		Scanner in = new Scanner(System.in);
		for(int i = 0;i<emp.length;i++)
		{
			System.out.println("Enter the details of Employee -> ");
			System.out.println("Enter the ID -> ");
			int id = in.nextInt();
			System.out.println("Enter the emp salary -> ");
			double salary = in.nextDouble();
			System.out.println("Enter the designation -> ");
			String designation = in.next();
			System.out.println("Enter the company Name -> ");
			String name = in.next();
			System.out.println("Enter the location -> ");
			String location = in.next();	
			emp[i] = new Employee(id,salary,designation);
		}
	}
	public void display(Employee[] emp)
	{
		
		for(Employee e:emp)
		{
			e.displayDetails();
		}
	}
	public void sortBySalary(Employee[] emp)
	{

	}
}
