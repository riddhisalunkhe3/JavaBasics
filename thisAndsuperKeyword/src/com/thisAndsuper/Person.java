package com.thisAndsuper;

import java.util.Scanner;

public class Person {
	Scanner in = new Scanner(System.in);
	private String personName;
	private int personAge;
	private String personAdd;
	private long personMoNo;
	
	public Person() {
	
	}
	public Person(String personName, int personAge, String personAdd, long personMoNo) {
		super();
		this.personName = personName;
		this.personAge = personAge;
		this.personAdd = personAdd;
		this.personMoNo = personMoNo;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public int getPersonAge() {
		return personAge;
	}
	public void setPersonAge(int personAge) {
		this.personAge = personAge;
	}
	public String getPersonAdd() {
		return personAdd;
	}
	public void setPersonAdd(String personAdd) {
		this.personAdd = personAdd;
	}
	public long getPersonMoNo() {
		return personMoNo;
	}
	public void setPersonMoNo(long personMoNo) {
		this.personMoNo = personMoNo;
	}
	public void acceptPerson()
	{
		this.setPersonName(in.next());
		this.setPersonAge(in.nextInt());
		this.setPersonAdd(in.next());
		this.setPersonMoNo(in.nextLong());
	}
	public void showPerson()
	{
		System.out.println(this.getPersonName());
		System.out.println(this.getPersonAge());
		System.out.println(this.getPersonAdd());
		System.out.println(this.getPersonMoNo());
	}
}
