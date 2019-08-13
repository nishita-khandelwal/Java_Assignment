package com.zensar;

public class Swapping<G> {
	public void swap(G a, G b) {
		G temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("value of a is "+a+" value of b is "+b);
	}
	public static void main(String args[]) 
	{
		Swapping<Employee> swapping=new Swapping<>();
		Employee employee=new Employee(111,"Nishita",1000);
		Employee employee2=new Employee(112,"Khandelwal",5432);
		System.out.println("Before swapping");
		employee.display();
		employee2.display();
		
		System.out.println("After swapping");
		swapping.swap(employee,employee2);
		employee.toString();
		System.out.println("\t");
		employee2.toString();
		
	}

}
