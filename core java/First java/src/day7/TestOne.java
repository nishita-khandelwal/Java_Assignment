package day7;

import java.util.Scanner;

class TestT implements Runnable {

	private Thread t1,t2;
	private String name1;
	
	public TestT(String s) {
		super();
		name1=s;
		t1=new Thread(this,name1);
		t2=new Thread(this,name1);
		t1.start();
		t2.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i;
		for(i=0;i<100;i++)
		{
			if(Thread.currentThread()==t1)
			{
				System.out.println(name1);
			}
			if(Thread.currentThread()==t2)
			{
				System.out.println(name1);
			}
		}
	}
		
}
public class TestOne
{
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a name");
		String string=scanner.next();
		new TestT(string);
		
	}
}