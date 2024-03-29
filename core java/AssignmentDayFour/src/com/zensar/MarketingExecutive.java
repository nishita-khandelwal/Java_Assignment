package com.zensar;

public class MarketingExecutive extends Employee
{
	
	private double bs=getBasicSalary();
	private double kmTravelled=0;
	private double tour_allowance=5*kmTravelled;
	private double telephone_allowance=2000;
	private double gs;
	private double ns;
	private double pf=0.125*bs;
	
	public MarketingExecutive() {
		super();
	}
	public MarketingExecutive(int empid, String name, double basicSalary,double kmTravelled) {
		super(empid,name,basicSalary);
		this.kmTravelled = kmTravelled;
	}
	public double getKmTravelled() {
		return kmTravelled;
	}
	public void setKmTravelled(double kmTravelled) {
		this.kmTravelled = kmTravelled;
	}
	public void GrossSalaryME() 
	{
		gs=bs+tour_allowance+telephone_allowance;
	}
	public void NetSalaryMS () 
	{
		ns=gs-pf;
	}
	public void display()
	{
		
		System.out.println("Gross Salary of marketing executive is"+(bs+tour_allowance+telephone_allowance)+" and net salary is"+(gs-pf));
	}
	
}
