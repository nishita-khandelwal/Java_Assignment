package com.zensar.question2;

import java.util.ArrayList;

public class Test {

	public static double calculateCustomerBill(ArrayList<IceCream> icecreams ) {
		double bill = 0.0;
		
		for(IceCream iceCream:icecreams) {
			bill = bill + (iceCream.getPrice()-iceCream.getDiscount());
		}
		
		return bill;
		
	}
	
	public static String getFlavourOfMaxPriceIcecream(ArrayList<IceCream> listOfIceCreams ) {
		Double maxPrice=0.0;
		IceCream iceCreamWithMaxPrice = null;
		for(int i=0; i<listOfIceCreams.size(); i++) {
			IceCream currentIceCream = listOfIceCreams.get(i);
			if(maxPrice<currentIceCream.getPrice()) {
				maxPrice = currentIceCream.getPrice();
				iceCreamWithMaxPrice = currentIceCream;
				
			}
		}
		
		
		return iceCreamWithMaxPrice.getFlavour();
	}
	
	public static void main(String[] args) {
		IceCream iceCream1 = new IceCream("vanilla", 45);
		IceCream iceCream2 = new IceCream("chocolate", 60);
		IceCream iceCream3 = new IceCream("pista", 55);
		IceCream iceCream4 = new IceCream("almond", 70);
		
		ArrayList<IceCream> listOfIceCreams = new ArrayList<IceCream>();
		listOfIceCreams.add(iceCream1);
		listOfIceCreams.add(iceCream2);
		listOfIceCreams.add(iceCream3);
		listOfIceCreams.add(iceCream4);
		
	//	String flavourOfMaxPriceIceCream = getFlavourOfMaxPriceIcecream(listOfIceCreams);
	//	System.out.println(flavourOfMaxPriceIceCream);
		
		double totalBillAmount = calculateCustomerBill(listOfIceCreams);
		System.out.println("Total Bill Amount: "+totalBillAmount);
		
		
		
	}
}
