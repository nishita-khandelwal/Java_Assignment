import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.zensar.UtilityList01;
import com.zensar.UtilityReport;
import com.zensar.Student;

public class TestOne {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Student student = new Student();
		List<Student> listStudents = new ArrayList<Student>();
		UtilityList01 utility = new UtilityList01();
		UtilityReport utilityReport=new UtilityReport();
		
		int ch = 0;
		
		while (true) {
			
			System.out.println("Choose an option");
			System.out.println("Choose 1 for insert one Student");
			System.out.println("Choose 2 to display the list");
			System.out.println("Choose 3 to exit");
			ch=scanner.nextInt();
			
		  switch (ch) 
		  {
			case 1:
			{
				System.out.println("Enter Roll No.");
				student.setRollno(scanner.nextInt());
				
				System.out.println("Enter Name");
				student.setName(scanner.next());
				
				System.out.println("Enter Percentage");
				student.setPercentage(scanner.nextDouble());
				
				System.out.println("Enter Skillsets seprated by ','");
				
				
				String skillString = scanner.next();
				
				String skillarray[] = skillString.split(",");
				
				Set<String> union = new HashSet<String>(); 
		        union.addAll(Arrays.asList(skillarray)); 
				student.setSkillset(union);	
				listStudents.add(student);
				utility.createList(listStudents);
				break;
				
				
			}
			case 2:
			{
				utilityReport.showReport(listStudents);
				break;
			}
			
			case 3:
			{
				System.exit(0);
			}
			default :
			{
				System.out.println("Invalid choice");
			}
		  }
			
		}
		
		
	}
}
