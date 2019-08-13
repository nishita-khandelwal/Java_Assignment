package com.zensar;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class UtilityReport {
	private String temp;
	private double temp1;
	private Map<String, Double> map=new HashMap<>();

	
	public void showReport(List<Student> list) 
	{
		for(Student student:list)
		{
			 map.put(student.getName(),student.getPercentage());
			
		}
		map.entrySet().forEach(entry->{
			System.out.println(entry.getKey()+" "+entry.getValue());
		});
	}

}
