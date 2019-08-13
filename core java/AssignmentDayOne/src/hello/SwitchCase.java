package hello;

import java.util.Scanner;

class SwitchCase {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int num1=0,num2=0,num3=0,result,ch=0;
		System.out.println("Enter the numbers to perform operation");
		num1=sc.nextInt();
		num2=sc.nextInt();
		System.out.println("Enter 1 to perform addition");
		System.out.println("Enter 2 to perform subtraction");
		System.out.println("Enter 3 to perform multiplication");
		System.out.println("Enter 4 to perform division");
		ch=sc.nextInt();
	    switch(ch)
	    {
	    	case 1:
	    	{
	    		num3=num1+num2;
	    	    break;
	    	}
	    	case 2:
	    	{
	    		num3=num1-num2;
	    	    break;
	    	}
	    	case 3:
	    	{
	    		num3=num2*num1;
	    	    break;
	    	}
	    	case 4:
	    	{
	    		num3=num1/num2;
	    	    break;
	    	}
	    	default :
	    	{
	    		System.out.println("Invalid Choice");
	    	}
	    }	
	    System.out.println("Result is"+num3);
	}
}
