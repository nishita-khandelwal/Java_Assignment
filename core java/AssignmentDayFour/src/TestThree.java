import java.util.Scanner;

import com.zensar.ExternalStudent;
import com.zensar.InternalStudent;
import com.zensar.Student;

public class TestThree {
	public static void printObjects(Student s)
	{
		s.display();
	}
	public static void main(String args[])
	{
		
		Scanner scanner=new Scanner(System.in);
		Student student=new Student(101,"Nishita","16/07/1997");
		printObjects(student);
		InternalStudent internalStudent=new InternalStudent(102,"kalne","18/05/1997","RGPV",56);
		printObjects(internalStudent);
		ExternalStudent externalStudent=new ExternalStudent(103,"aarohi","07/12/1997","Acropolis",'A');
		printObjects(externalStudent);
		
		int ch,j=0;
		
		Student stdArray[] = new Student[2]; //array of objects
		for(int i=0; i<stdArray.length;i++)
			stdArray[i]=new Student();
		
		String strName= " ";
		int temp=0;
		String temp2="";
		
		while(j<2)
		{
		System.out.println("Choose an option");
		System.out.println("Choose 1 for inserting");
		System.out.println("Choose 2 for displaying");
		System.out.println("Choose 3 to exit");
		ch=scanner.nextInt();
		switch (ch) {
		case 1:
		{
			for (int i = 0; i < stdArray.length; i++) {
				
				System.out.println("Enter user "+(i+1)+" details");
				temp=scanner.nextInt();
				strName= scanner.next();
				temp2=scanner.next();
				
				stdArray[i].setRollno(temp);
				stdArray[i].setName(strName);
				stdArray[i].setDob(temp2);
				
			}
		}
		case 2:
		{
			System.out.println("The details are:");
			for(int i=0;i<temp;i++) {
				System.out.println(stdArray[i].getRollno()+" "+stdArray[i].getName()+" "+stdArray[i].getDob());
			}
			break;
		}
		case 3:
		{
			System.exit(0);
		}
		default:
			System.out.println("Invalid choice");
			break;
		}
	
		j++;
	}
	}

}
