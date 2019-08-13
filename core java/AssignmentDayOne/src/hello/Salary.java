package hello;

import java.util.Scanner;

class Salary {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int basicsalary=0;
		double hra,da,pf,gs,ns;
		System.out.println("Enter the basic salary of employee");
		basicsalary=sc.nextInt();
		hra=0.15*basicsalary;
		da=0.3*basicsalary;
		gs=basicsalary+hra+da;
		pf=0.125*gs;
		ns=gs-pf;
		System.out.println("Basic salary of employee is"+basicsalary);
		System.out.println("HRA of employee is"+hra);
		System.out.println("DA of employee is"+da);
		System.out.println("GS of employee is"+gs);
		System.out.println("PF of employee is"+pf);
		System.out.println("Net salary of employee is"+ns);
	}
}
