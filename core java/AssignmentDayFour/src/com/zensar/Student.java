package com.zensar;

import java.util.Scanner;

public class Student {
	private int rollno;
	private String name;
	private String dob;
	
	
	public Student() {
		super();
		rollno=111;
		name="Akshay";
		dob="12/06/2019";
	}
	public Student(int rollno, String name,String dob) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.dob = dob;
	}
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public void display() 
	{
		System.out.println("Name is "+name+"roll no is "+rollno+"dob is "+dob);
	}

}
