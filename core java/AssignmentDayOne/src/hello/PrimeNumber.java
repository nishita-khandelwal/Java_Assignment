package hello;

import java.util.Scanner;

class PrimeNumber {
	public static void main(String args[])
	{
	    Scanner sc=new Scanner(System.in);
	    int i,num=0,flag=0,m;
	    System.out.println("Enter the number to check prime or not");
	    num=sc.nextInt();
	    m=num/2;
	    if(num==0 || num==1)
	    {
	    	System.out.println(num+"is not prime number");
	    	flag=1;
	    }
	    else
	    {
	      for(i=2;i<=m;i++)
	      {
	    	if(num%i==0)
	    	{
	    		flag=1;
	    		break;
	    	}	
	      }
	    }
	    if(flag==0)
	    {
	    	System.out.println(num+" is prime number");
	    }
	    else
	    {
	    	System.out.println(num+" is not prime number");
	    }
	}
}
