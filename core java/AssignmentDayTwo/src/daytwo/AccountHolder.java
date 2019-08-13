package daytwo;

import java.util.Scanner;

class Statement
{
	private int account_number=0; 
	private String account_holder_name=" ";
	private double account_balance=0;
	
	
	public Statement() {
		super();
	}
	public Statement(int account_number, String account_holder_name, double account_balance) {
		super();
		this.account_number = account_number;
		this.account_holder_name = account_holder_name;
		this.account_balance = account_balance;
	}
	public int getAccount_number() {
		return account_number;
	}
	public void setAccount_number(int account_number) {
		this.account_number = account_number;
	}
	public String getAccount_holder_name() {
		return account_holder_name;
	}
	public void setAccount_holder_name(String account_holder_name) {
		this.account_holder_name = account_holder_name;
	}
	public double getAccount_balance() {
		return account_balance;
	}
	public void setAccount_balance(double account_balance) {
		this.account_balance = account_balance;
	}
	
	public void deposite(int deposite_amount)
	{
		this.account_balance+=deposite_amount;
		System.out.println("Updated Account balance of Mr."+account_holder_name+"is "+account_balance);
	}
	public void withdraw(int withdraw_amount)
	{
		this.account_balance-=withdraw_amount;
		System.out.println("Updated Account balance of Mr."+account_holder_name+"is "+account_balance);
	}
	public void display()
	{
		System.out.println(account_number+" "+account_holder_name+" "+account_balance);
	}
}
public class AccountHolder {
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		
		Statement stmtArray[] = new Statement[5]; //array of objects
		for(int i=0; i<stmtArray.length;i++)
			stmtArray[i]=new Statement();
		
		
		
		
		String strName= " ";
		int temp=0;
		double temp2=0;
		
		for (int i = 0; i < stmtArray.length; i++) {
			
			System.out.println("Enter user "+(i+1)+" details");
			
			strName= scanner.next();
			
			temp=scanner.nextInt();
			temp2=scanner.nextDouble();
			
			stmtArray[i].setAccount_holder_name(strName);
			stmtArray[i].setAccount_number(temp);
			stmtArray[i].setAccount_balance(temp2);
			
		}
		
		for (Statement statement : stmtArray) {
			statement.display();
		}
		
		
		stmtArray[0].display();
		stmtArray[1].setAccount_balance(2000);
		stmtArray[1].setAccount_holder_name("Bansal");
		stmtArray[1].setAccount_number(102);
		System.out.println(stmtArray[1].getAccount_number()+" ");
		System.out.print(stmtArray[1].getAccount_holder_name()+" ");
		System.out.print(stmtArray[1].getAccount_balance());
		
		System.out.println("Enter the amount to be deposited ");
		stmtArray[1].deposite(scanner.nextInt());
		
		System.out.println("Enter the amount to be debited ");
		stmtArray[0].withdraw(scanner.nextInt());
		
		
		
	
	}
}