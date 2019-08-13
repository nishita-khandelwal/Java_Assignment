package com.zensar;
import java.util.Scanner;

class MyThread extends Thread{
	private int num;
	public MyThread(int n) {
		num=n;
	}
	public void run() {
		for(int i=1;i<=10;i++) {
		System.out.println(num);
		num++;
	}}
}
class MyThread1 extends Thread{
	private int num;
		public MyThread1(int n) {
			num=n;
		}
		public void run() {
			for(int i=1;i<10;i++) {
				System.out.println(num+" * "+i+" = "+num*i);
				 }
	}
}
public class ques1 {
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter a number:");
		int n=scanner.nextInt();
		MyThread t1=new MyThread(n);
		MyThread1 t2=new MyThread1(n);
		t1.start();
		t2.start();
	}
}
