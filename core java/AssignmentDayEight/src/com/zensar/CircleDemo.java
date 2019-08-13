package com.zensar;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.HeadlessException;


class MovingCircle extends Frame implements Runnable
{
	private int xg,xb;
	private int flag=0;
	private Thread t1,t2;
	public MovingCircle() throws HeadlessException {
		super();
		xg=xb=100;
		t1=new Thread(this,"red");
		t2=new Thread(this,"yellow");
		t1.start();
		t2.start();
		
	}

	public void paint(Graphics g) {
		g.setColor(Color.red);
		g.fillOval(xb, 200, 50, 50);
		g.setColor(Color.yellow);
		g.fillOval(xg, 300, 50, 50);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			
			if (flag==0) {
			if(Thread.currentThread()==t1)
			{
				synchronized (this) {
				xb++;
				if(xb==this.getWidth()-50)
				{
					
					try {
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				}
				try {
					Thread.sleep(20);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (Thread.currentThread()==t2) 
			{
				xg--;
				synchronized (this) {
				if(xg==this.getWidth()-50)
				{
						notify();
						flag=1;
				}}
				try {
					Thread.sleep(30);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			repaint();
		}
			if (flag==1) {
				if(Thread.currentThread()==t1)
				{
					synchronized (this) {
					xb--;
					if(xb==this.getWidth()-50)
					{
						
						try {
							wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					}
					try {
						Thread.sleep(20);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				if (Thread.currentThread()==t2) 
				{
					xg++;
					synchronized (this) {
					if(xg==this.getWidth()-50)
					{
							notify();
							flag=0;
					}}
					try {
						Thread.sleep(30);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				repaint();
			}
				
			}
		
	}
}

public class CircleDemo {
	public static void main(String[] args) {
		MovingCircle movingCircle=new MovingCircle();
		movingCircle.setSize(500, 500);
		movingCircle.setVisible(true);
		System.out.println("Test");
	}
}