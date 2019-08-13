package hello;

import java.util.Scanner;

public class Marks {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		float subone,Subtwo,subthree,subfour,subfive,avg;
		System.out.println("Enter the value of 5 subjects");
		subone=sc.nextFloat();
		Subtwo=sc.nextFloat();
		subthree=sc.nextFloat();
		subfour=sc.nextFloat();
		subfive=sc.nextFloat();
		
		avg=(subone+Subtwo+subthree+subfour+subfive)/5;
		System.out.println("Average of student is"+avg);
		
		
		
	}
}
