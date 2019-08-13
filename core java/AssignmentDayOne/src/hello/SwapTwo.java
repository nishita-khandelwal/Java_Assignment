package hello;

import java.util.Scanner;

class SwapTwo {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int num1=0,num2=0;
		System.out.println("Enter the numbers to swap");
		num1=sc.nextInt();
		num2=sc.nextInt();
		System.out.println("Before swapping num1 is"+num1);
		System.out.println("Before swapping num2 is"+num2);
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("After swapping num1 is"+num1);
		System.out.println("After swapping num2 is"+num2);
	}

}
