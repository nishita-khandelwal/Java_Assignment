package hello;

public class Pattern {
	public static void main(String args[])
	{
		int i,j;
		 for (i= 1; i<=5;i++) 
		 {
	            for (j= 1; j<=6-i;j++) 
	            System.out.print(j);
	            
	            for ( j= 1; j<=(2*(i-1))-1;j++) 
	                 	System.out.print(" ");
	            
	            for ( j=6-i;j>=1;j--) 
	                	 	 if(j!=5)
	                			 System.out.print(j);
	                		     System.out.println();
	                	 
	        }
	}

}
