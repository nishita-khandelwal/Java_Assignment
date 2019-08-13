package com.zensar.question1;

import java.util.ArrayList;

public class Part2 {

	public static void main(String[] args) {
		ArrayList<Double> listOfNumbers = new ArrayList<Double>();
		listOfNumbers.add(25.70);
		listOfNumbers.add(16.25);
		listOfNumbers.add(45.85);
		listOfNumbers.add(35.5);
		listOfNumbers.add(12.25);
		
		for(int i=0; i<listOfNumbers.size(); i++) {
			Double num = listOfNumbers.get(i);
			if((num>12.0) && (num<40.0)) {
				Double incrementedValue = num+2.5;
				listOfNumbers.set(i, incrementedValue);
			}
		}
		
		System.out.println(listOfNumbers);
	}
}
