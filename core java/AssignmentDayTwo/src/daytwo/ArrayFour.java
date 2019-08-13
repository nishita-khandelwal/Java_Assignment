package daytwo;

import java.util.Scanner;

public class ArrayFour {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int a[]=new int[5];
		int b[]=new int[5];
		
		System.out.println("Enter the elements of array");
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<a.length;i++)
		{
				int temp=a.length-1;
				
				b[i]=a[temp-i];
			
		}
		
		System.out.println("Array element after reversing are");
		
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]+" ");
		}
	}
}
