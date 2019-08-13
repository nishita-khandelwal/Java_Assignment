package daytwo;

import java.util.Scanner;

public class ArrayTwo {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elements of array");
		int a[][]=new int[3][3];
		int b[][]=new int[3][3];
		int c[][]=new int[3][3];
		int d[][]=new int[3][3];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Array element are");
		for(int x[]:a)
		{
			for(int y:x)
			{
				System.out.print(y+" ");	
			}
			System.out.println();
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				b[j][i]=a[i][j];
			}
		}
		System.out.println("Array element after transpose");
		for(int x[]:b)
		{
			for(int y:x)
			{
				System.out.print(y+" ");	
			}
			System.out.println();
		}
		System.out.println("Enter the elements of array two for addition");
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c.length;j++)
			{
				c[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				d[i][j]=a[i][j]+c[i][j];
			}
		}
		System.out.println(" array after addition is");
		for(int x[]:d)
		{
			for(int y:x)
			{
				System.out.print(y+" ");	
			}
			System.out.println();
		}
	}

}
