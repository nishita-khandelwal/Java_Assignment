package com.zensar;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class UtilityList01 {
	private List<Student> list; 
	public UtilityList01() {
		super();
	}
	public void createList(List<Student> li) 
	{
		System.out.println("Saving.....");
		list = new ArrayList<Student>(li);
	}
	public void printList() 
	{
		Iterator<Student> iterator=list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next()+" "+iterator.toString());
	}
	}
}
