package com.zensar;

public class CktPlayer implements Printable  {
	
	private String name;
	private int run;
	
	
	public CktPlayer() {
		super();
		name="Aadii";
		run=50;
	}
	public CktPlayer(String name, int run) {
		super();
		this.name = name;
		this.run = run;
	}
	@Override
	public void printDetails() {
		// TODO Auto-generated method stub
		System.out.println(" Name of player is:-"+name+"Runs scored are:-"+run);
	}

}
