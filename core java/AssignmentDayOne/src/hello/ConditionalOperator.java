package hello;

import java.util.Scanner;

class ConditionalOperator {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int num1=0,num2=0,num3=0,bn=0;
		System.out.println("Enter three numbers");
		num1=sc.nextInt();
		num2=sc.nextInt();
		num3=sc.nextInt();
		bn=( num1 > num2 ? num1 : num2 > num3 ? num1 : num3);
		System.out.println("The gretest number is"+bn);
	}
}
