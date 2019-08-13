package daytwo;

import java.util.Scanner;

public class ArrayOne {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int a[]=new int[5];
		int temp[]=new int[5];
		System.out.println("Enter the elements of array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int max=a[0];
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			
				if(a[i]>max)
				{
					max=a[i];
				}
			
		}
		for(int i=0;i<a.length;i++)
		{
			
				if(a[i]<min)
				{
					min=a[i];
				}
			
		}
			System.out.println("Maximum element of the array is"+max);
			System.out.println("Minimum element of the array is"+min);
			
			System.out.println("Array element before multiplication are");
			for(int i=0;i<a.length;i++)
			{
				System.out.println(a[i]+" ");
			}
			for(int i=0;i<a.length;i++)
			{
				temp[i]=a[i]*5;				
			}
			System.out.println("Array element after multiplication are");
			for(int i=0;i<a.length;i++)
			{
				System.out.println(temp[i]+" ");
			}
		    
	}
}
