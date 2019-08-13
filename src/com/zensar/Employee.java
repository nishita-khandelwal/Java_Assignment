package com.zensar;

public class Employee {
	private int empid;
	private String name;
	private Date dob;
	
	public Employee() {
		empid=1;
		name="abc";
		dob=new Date();
	}

	public Employee(int empid, String name, int d, int m, int y) {
		super();
		this.empid = empid;
		this.name = name;
		dob =new Date(d,m,y);
	}
	public void display()
	{
		System.out.println("Emp id is"+empid);
		System.out.println("Name is"+name);
		dob.toString();
	}

}
