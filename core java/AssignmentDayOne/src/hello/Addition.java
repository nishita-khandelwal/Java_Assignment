package hello;

import java.util.Scanner;

class Addition {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int num1=0,num2=0,result;
		System.out.println("Enter the value of two numbers");
		num1=sc.nextInt();
		num2=sc.nextInt();
		
	    result=num1+num2;
		
		
		System.out.println("Addition of two numbers is"+result);
		
}
}
