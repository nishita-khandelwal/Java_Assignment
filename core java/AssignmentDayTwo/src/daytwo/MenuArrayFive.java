package daytwo;

import java.util.Scanner;
class Account{
	private int no;
	private String name;
	private double bal;
	public Account() {
		
	}
	public Account(int accno,String accName,double accbal) {
		no=accno;
		name=accName;
		bal=accbal;
	}
	public void setno(int accno) {
		no=accno;
	}
	public int getno() {
		return no;
	}
	public void setname(String accname) {
		name=accname;
	}
	public void setbal(double accbal) {
		bal=accbal;
	}
	public String getname() {
		return name;
	}
	public double getbal() {
		return bal;
	}
	public double deposit(double amt) {
		bal=bal+amt;
		return bal;
	}
	public double withdraw(double amt) {
		bal=bal-amt;
		return bal;
	}
	public void insert(int accno,String accname,double accbal) {
		no=accno;
		name=accname;
		bal=accbal;
	}
}
public class MenuArrayFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int ch;
		Account acc[]=new Account[10];
		for(int i=0;i<acc.length;i++) {
			acc[i]=new Account();
		}
		int control=0,temp=0;
		while(control<10) {
		System.out.println("Press the choosen option: \n 1.Add new Account \n 2.Display details of all account holder. \n 3.Deposit Amount \n 4. Withdraw Amount \n 5.Exit \n Enter your choice:");
		ch=sc.nextInt();
		switch(ch) {
		case 1:
			System.out.println("Enter account no,name and balance:");
			int accno;
			String accname;
			double accbal;
			accno=sc.nextInt();
			accname=sc.next();
			accbal=sc.nextDouble();
			acc[temp].insert(accno,accname,accbal);
			System.out.println("Values Enteres!");
			temp++;
			break;
		case 2:
			System.out.println("The details are:");
			for(int i=0;i<temp;i++) {
				System.out.println(acc[i].getno()+" "+acc[i].getname()+" "+acc[i].getbal());
			}
			break;
		case 3:
			int accnum;
			double accamt;
			System.out.println("Enter account number and amount:");
			accnum=sc.nextInt();
			accamt=sc.nextDouble();
			for(int i=0;i<temp;i++) {
				if(acc[i].getno()==accnum) {
					System.out.println("Total Amount: "+acc[i].deposit(accamt));
				}
			}		
			break;
		case 4:
			int accnumb;
			double accamot;
			System.out.println("Enter account number and amount:");
			accnumb=sc.nextInt();
			accamot=sc.nextDouble();
			for(int i=0;i<temp;i++) {
				if(acc[i].getno()==accnumb) {
					System.out.println("Total Amount: "+acc[i].withdraw(accamot));
				}
			}
			break;
		case 5:
			System.exit(0);
			
			
		}
		control++;}
	}

}