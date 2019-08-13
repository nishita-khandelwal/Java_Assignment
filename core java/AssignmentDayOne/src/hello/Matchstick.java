package hello;

import java.util.Scanner;

public class Matchstick {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int player=0,computer,total=21;
		while(total>1)
		{
		System.out.println("Enter the choice");
		System.out.println("Enter 1 for picking 1 matchstick the choice");
		System.out.println("Enter 2 for picking 2 matchstick the choice");
		System.out.println("Enter 3 for picking 3 matchstick the choice");
		System.out.println("Enter 4 for picking 4 matchstick the choice");
		System.out.println("Your chance to pick again");
		player=sc.nextInt();
		
		 switch(player)
		    {
		    	case 1:
		    	{
		    		computer=4;
		    		System.out.println("Computer picked"+computer+" match stick");
		    		total=total-5;
		    		System.out.println("Number of match stick left"+total);
		    	    break;
		    	}
		    	case 2:
		    	{
		    		computer=3;
		    		System.out.println("Computer picked"+computer+" match stick");
		    		total=total-5;
		    		System.out.println("Number of match stick left"+total);
		    	    break;
		    	}
		    	case 3:
		    	{
		    		computer=2;
		    		System.out.println("Computer picked"+computer+" match stick");
		    		total=total-5;
		    		System.out.println("Number of match stick left"+total);
		    	    break;
		    	}
		    	case 4:
		    	{
		    		computer=1;
		    		System.out.println("Computer picked"+computer+" match stick");
		    		total=total-5;
		    		System.out.println("Number of match stick left"+total);
		    	    break;
		    	}
		    	default :
		    	{
		    		System.out.println("Invalid Choice");
		    	}
		    }
		}
		System.out.println("Your chance to pick");
		System.out.println("As only 1 matchstick left You lost");
		
		
	}

}
