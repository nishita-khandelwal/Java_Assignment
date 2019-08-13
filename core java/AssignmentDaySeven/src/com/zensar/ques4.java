package com.zensar;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

class MovingCir extends Frame implements Runnable{
	private Thread t1,t2;
	private int x1;
	public MovingCir() {
		x1=200;
		t1=new Thread(this,"circle");
		t2=new Thread(this,"cirrcle");
		t1.start();
	}
	public void paint(Graphics g) {
		g.setColor(Color.red);
		g.fillOval(100, 100, x1, x1);
	}
	
	public void run() {
		int x,flag=0;
		while(true) {
			if(flag==0) {
				x1++;
				if(x1==350)
				{
					flag=1;
				}
			try {
				Thread.sleep(10);
			} catch (Exception e) {}
			}
			else if(flag==1) {
				x1--;
				if(x1==50) {
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
public class ques4 {
	public static void main(String args[]) {
		MovingCir mocCir=new MovingCir();
		mocCir.setVisible(true);
		mocCir.setSize(400,400);
		System.out.println("Test");
	}
}