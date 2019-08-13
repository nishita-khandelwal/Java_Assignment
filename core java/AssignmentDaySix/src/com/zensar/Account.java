package com.zensar;

import java.util.Scanner;

class OverLimit extends Exception {
	public OverLimit()
	{
		super();
	}
}
class InsufficientBalance extends Exception{
	public InsufficientBalance()
	{
		super();
	}
}


class AccountDetails {
	
	private static double balance;
	
	public AccountDetails() {
		super();
	}
	public AccountDetails(double balance) {
		super();
		this.balance = balance;
	}
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "AccountDetails [balance=" + balance + "]";
	}
	public double withdraw(double amount) throws InsufficientBalance  {
		if(balance<amount)
		{
			throw new InsufficientBalance();
		}
		balance-=amount;
		return amount;
	}
	public void deposite(double amount) throws OverLimit{
		if(amount>15000)
		{
			throw new OverLimit();
		}
		else
		balance+=amount;
	}
}
public class Account
{
	public static void main(String args[]) 
	{
		Scanner scanner=new Scanner(System.in);
		int ch;
		AccountDetails accountDetails=new AccountDetails();
		
		while(true)
		{
			System.out.println("Choose an option");
			System.out.println("Choose 1 for inserting");
			System.out.println("Choose 2 for Withdrwaing");
			System.out.println("Choose 3 for depositing");
			System.out.println("Choose 4 for displaying total balance");
			System.out.println("Choose 5 to exit");
			ch=scanner.nextInt();
		  switch (ch) 
		  {
			case 1:
			{
				System.out.println("Enter the balance");
				double balance=scanner.nextDouble();
				accountDetails.setBalance(balance);
				break;
			}
			case 2:
			{
				System.out.println("Enter the amount to be withdraw");
				double amount=scanner.nextDouble();
				try {
					accountDetails.withdraw(amount);
				} catch (InsufficientBalance e) {
					// TODO Auto-generated catch block
					System.out.println("Amount is insufficient");
					e.printStackTrace();
				}
				break;
			}
			case 3:
			{
				System.out.println("Enter the amount to be deposite");
				double amount=scanner.nextDouble();
				try {
					accountDetails.deposite(amount);
				} catch (OverLimit e) {
					// TODO Auto-generated catch block
					System.out.println("Amount is overlimit");
					e.printStackTrace();
				}
				break;
			}
			case 4:
			{
				System.out.println(accountDetails.getBalance());
				break;
			}
			case 5:
			{
				System.exit(0);
			}
			default :
			{
				System.out.println("Invalid choice");
			}
		  }
		
		
	}
}}