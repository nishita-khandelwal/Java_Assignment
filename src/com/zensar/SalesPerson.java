package com.zensar;

public class SalesPerson extends WageEmployee{
	private int noOfItem;
	private int commision;
	private int salary1;
	WageEmployee wageEmployee=new WageEmployee();
	private int h=wageEmployee.getHours();
	private int r=wageEmployee.getRate();
	public SalesPerson() {
		super();
	}
	public SalesPerson(int empid, String name, int d, int m, int y,int hours, int rate,int noOfItem, int commision) {
		super(empid,name,d,m,y,hours,rate);
		this.noOfItem = noOfItem;
		this.commision = commision;
	}
	public void display()
	{
		super.display();
		System.out.println("No. of item are"+noOfItem);
		System.out.println("and commision is"+commision);
	}
	public void salarySalesEmp() 
	{
		salary1=(h*r)+(noOfItem*commision);
		System.out.println("Sales person salary is"+salary1);
	}
}
