package hello;

import java.util.Scanner;

class TotalSales {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the basic salary and sales amount");
		double bs,sales,ns=0.0,comission=0.0;
		bs=sc.nextDouble();
        sales=sc.nextDouble();
        if(sales<5000) 
        { 	
        	comission=sales;
        }
        else if(sales>=5000 && sales<=7500) 
        { 	
        	comission=0.03*sales;
        }
        else if(sales>=7501 && sales<=10500) 
        { 	
        	comission=0.08*sales;
        }
        else if(sales>=10501 && sales<=15000) 
        { 	
        	comission=0.11*sales;
        }
        else
        { 	
        	comission=0.15*sales;
        }
        ns=bs+comission;
        System.out.println("Net salary is"+ns);
        System.out.println("comission is"+comission);
	}
}
