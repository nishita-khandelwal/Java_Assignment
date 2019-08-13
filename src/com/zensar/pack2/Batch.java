package com.zensar.pack2;

public class Batch {
	
	private String courseName;
	private int batchStregth;
	
	
	public Batch() {
		super();
	}
	public Batch(String courseName, int batchStregth) {
		super();
		this.courseName = courseName;
		this.batchStregth = batchStregth;
	}
	public void display()
	{
		System.out.println("Course name is"+courseName+" and batch strength"+batchStregth);
	}
	public static void fun()
	{
	}
}
