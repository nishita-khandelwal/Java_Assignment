package hello;

import java.util.Scanner;

class AmstrongNumber {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int num=0,temp=0,n=0,a;
		System.out.println("Enter the number");
		num=sc.nextInt();
		temp=num;
		while(num>0)
		{
		    a=num%10;	
			num=num/10;
			n=n+(a*a*a);
		}
		if(temp==n)
		{
		System.out.println("Number is Amstrong number");       
		}
		else
		{
			System.out.println("Number is not Amstrong number"); 
		}

	}
}