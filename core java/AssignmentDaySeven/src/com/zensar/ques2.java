package com.zensar;

import java.util.Scanner;

class MyThread2 implements Runnable {
	private Thread t1,t2;
	private int num1,num2;
	public int fact(int n) {
		while(n>1) 
			return n*fact(n-1);
		return 1;
	}
	public int sum(int m) {
		int sum=0;
		while(m>0) {
			int rem=m%10;
			sum=sum+rem;
			m=m/10;
		}
		return sum;
	}
	public MyThread2(int n1,int n2){
		num1=n1;
		num2=n2;
		t1=new Thread(this,"a");
		t2=new Thread(this,"b");
		t1.start();
		t2.start();
	}
	public void run() {
		for(int i=num1;i<=num2;i++) {
		if(Thread.currentThread()==t1) {
			System.out.println("factorial of "+i+" is: "+fact(i));
		}
			else if(Thread.currentThread()==t2) {
				System.out.println("Sum of "+i+" is "+sum(i));
			}
		}
	}
}
public class ques2 {
	public static void main(String arghs[]) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter two numbers:");
	int num1=scanner.nextInt();
	int num2=scanner.nextInt();
	MyThread2 mt2=new MyThread2(num1, num2);
	}
}
