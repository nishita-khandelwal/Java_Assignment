package com.zensar;

import org.omg.PortableInterceptor.ServerRequestInfo;

public class InternalStudent extends Student {
	private String university;
	private double percentage;
	public InternalStudent() {
		super();
		// TODO Auto-generated constructor stub
	}
	public InternalStudent(int rollno, String name,String dob,String university,double percentage) {
		super(rollno, name, dob);
		// TODO Auto-generated constructor stub
		this.university=university;
		this.percentage=percentage;
	}
	public void display() 
	{
		super.display();
		System.out.println("university is "+university+"percentage is "+percentage);
	}
	
	

}
