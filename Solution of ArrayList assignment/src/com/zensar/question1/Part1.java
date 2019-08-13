package com.zensar.question1;

import java.util.ArrayList;

public class Part1 {

	public static void main(String[] args) {
		ArrayList<Double> listOfNumbers = new ArrayList<Double>();
		listOfNumbers.add(25.70);
		listOfNumbers.add(16.25);
		listOfNumbers.add(45.85);
		listOfNumbers.add(35.5);
		listOfNumbers.add(12.25);
		
		Double sum = 0.0;
		for(Double num:listOfNumbers) {
			sum = sum + num;
		}
		System.out.println("Sum: "+sum);
		Double average = sum/listOfNumbers.size();
		System.out.println("Average:"+average);

	}

}
