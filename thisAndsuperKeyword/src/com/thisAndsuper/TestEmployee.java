package com.thisAndsuper;

public class TestEmployee {
	public static void main(String[] args) {
		Employee[] emp = new Employee[2];
		EmployeeController con = new EmployeeController();
		con.accept(emp);
		con.display(emp);
	}
}
