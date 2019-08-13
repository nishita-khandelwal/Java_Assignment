package com.zensar;

import java.util.Scanner;

public class Student {
	private int rollNo;
	private String nameString;
	
	
	public Student() {
		super();
	}
	public Student(int rollNo, String nameString) {
		super();
		this.rollNo = rollNo;
		this.nameString = nameString;
	}
	public void display() 
	{
		System.out.println("Roll no of Student is"+rollNo+" and name is:-"+nameString);
	}

}
