package com.thisAndsuper;

import java.util.Scanner;

public class Student extends Person{
	Scanner in = new Scanner(System.in);
	private String studDept;
	private String studcurrentYear;
	private String studCourse;
	
	public Student() {
		super();
	}
	public Student(String personName, int personAge, String personAdd, long personMoNo) {
		super(personName, personAge, personAdd, personMoNo);
	}
	public Student(String studDept, String studcurrentYear, String studCourse) {
		super();
		this.studDept = studDept;
		this.studcurrentYear = studcurrentYear;
		this.studCourse = studCourse;
	}
	public String getStudDept() {
		return studDept;
	}
	public void setStudDept(String studDept) {
		this.studDept = studDept;
	}
	public String getStudcurrentYear() {
		return studcurrentYear;
	}
	public void setStudcurrentYear(String studcurrentYear) {
		this.studcurrentYear = studcurrentYear;
	}
	public String getStudCourse() {
		return studCourse;
	}
	public void setStudCourse(String studCourse) {
		this.studCourse = studCourse;
	}
	public void acceptStudent()
	{
		super.acceptPerson();
		this.setStudCourse(in.next());
		this.setStudcurrentYear(in.next());
		this.setStudDept(in.next());
	}
	public void showStudent()
	{
		super.showPerson();
		System.out.println(this.getStudCourse());
		System.out.println(this.getStudcurrentYear());
		System.out.println(this.getStudDept());
	}
}
