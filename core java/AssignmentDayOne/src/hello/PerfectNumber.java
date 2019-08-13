package hello;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int num,result=0;
		System.out.println("Enter the number");
		num=sc.nextInt();
		for (int i= 1; i<=num/2;++i) 
		 {
		    if(num%i==0)
		    {
		    	result=result+i;
		    }
		 }
		if(result==num)
		{
			System.out.println("Perfect number");
		}
		else
		{
			System.out.println(" Not a Perfect number");
		}
		 
	}
}
