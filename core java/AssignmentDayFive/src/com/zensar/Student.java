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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dob == null) ? 0 : dob.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + rollno;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (dob == null) {
			if (other.dob != null)
				return false;
		} else if (!dob.equals(other.dob))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (rollno != other.rollno)
			return false;
		return true;
	}
	public static void main(String args[]) {
		Student student=new Student(111,"Aksahy","29/04/1998");
		Student student2=new Student(111,"Aksahy","29/04/1998");
		Student student3=new Student(112,"Sam","12/12/1968");
		if(student.equals(student2))
		{
			System.out.println("same");
		}
		else {
			{
				System.out.println("not same");
			}
		}
		System.out.println("Hash code is 1st obj"+student.hashCode());
		System.out.println("Hash code is 2nd obj"+student2.hashCode());
		if(student.equals(student3))
		{
			System.out.println("same");
		}
		else {
			{
				System.out.println("not same");
			}
		}
		System.out.println("Hash code is 1st obj"+student.hashCode());
		System.out.println("Hash code is 2nd obj"+student3.hashCode());
		
	}

}
