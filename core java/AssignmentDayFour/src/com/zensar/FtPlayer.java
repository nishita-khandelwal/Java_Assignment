package com.zensar;

public class FtPlayer implements Printable {

	private String name;
	private int goals;
	public FtPlayer() {
		super();
		name="Aadiii";
		goals=50;
	}
	public FtPlayer(String name, int goals) {
		super();
		this.name = name;
		this.goals = goals;
	}
	@Override
	public void printDetails() {
		// TODO Auto-generated method stub
		System.out.println(" Name of player is:-"+name+"goals scored are:-"+goals);
		
	}

}
