package hello;

import java.util.Scanner;

public class RangePerfectNumber {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int num,result=0,num1,num2;
		System.out.println("Enter the start range");
		System.out.println("Enter the end range");
		num1=sc.nextInt();
		num2=sc.nextInt();
		for(int j=num1; j<=num2;j++) 
		{
			result=0;
		for (int i= 1; i<j;i++) 
		 {
		    if(j%i==0)
		    	result=result+i;
		    
		 }
		if(result==j)
		{
			System.out.println(j+" is Perfect number");
			
		}
		} 
	
		}

}
