package com.zensar;

import java.util.Scanner;
import java.util.Set;

public class Student {
	private int rollno;
	private String name;
	private double percentage;
	private Set<String> skillset;
	
	
	public Student() {
		super();
	}
	public Student(int rollno, String name, double percentage, Set<String> skillset) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.percentage = percentage;
		this.skillset = skillset;
	}
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public Set<String> getSkillset() {
		return skillset;
	}
	public void setSkillset(Set<String> skillset) {
		this.skillset = skillset;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", percentage=" + percentage + ", skillset=" + skillset
				+ "]";
	} 
}
