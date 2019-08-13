package com.zensar.pack1;

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
		System.out.println("Course name is"+rollNo+" and batch strength"+nameString);
	}
	

}
