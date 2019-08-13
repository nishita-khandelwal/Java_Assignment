package hello;

import java.util.Scanner;

public class FirstHundredPrimeNumber {
	public static void main(String args[])
	{
		System.out.println("Prime numbers between 1 to 100 are");
	  int i,
	  num=0,flag=0,m;
	  for(num=1;num<=100;num++) 
	  {
	    m=num/2;
	    flag=0;
	    if(num==0 || num==1)
	    {
	    	flag=1;
	    }
	    else
	    {
	      for(i=2;i<=m;i++)
	      {
	    	if(num%i==0)
	    	{
	    		flag=1;
	    	}	
	      }
	    }
	    if(flag==0)
	    {
	    	System.out.println(num+" is prime number");
	    }
	  }  
	}

}
