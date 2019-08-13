package com.zensar;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

class MovingCircle extends Frame implements Runnable{
	private Thread t1,t2;
	private int x1;
	public MovingCircle() {
		x1=200;
		t1=new Thread(this,"circle");
		t2=new Thread(this,"cirrcle");
		t1.start();
	}
	public void paint(Graphics g) {
		g.setColor(Color.pink);
		g.fillOval(x1, 100, 150, 80);
	}
	
	public void run() {
		int x,flag=0;
		while(true) {
			if(flag==0) {
				x1++;
				if(x1==this.getWidth()-150)
				{
					flag=1;
				}
			try {
				Thread.sleep(10);
			} catch (Exception e) {}
			}
			else if(flag==1) {
				x1--;
				if(x1==0) {
					flag=0;
				}
			try {
				Thread.sleep(10);
			} catch (Exception e) {}
			}
			repaint();
			}
		}
	}
public class ques3 {
	public static void main(String args[]) {
		MovingCircle mocCircle=new MovingCircle();
		mocCircle.setVisible(true);
		mocCircle.setSize(400,400);
		System.out.println("Test");
	}
}