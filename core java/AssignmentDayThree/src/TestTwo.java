//main methode for que 5


import java.util.Scanner;
import com.zensar.Address;
import com.zensar.Student;

public class TestTwo {
	

	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the value of roll no,name,street,area,city,state ");
		int roll=scanner.nextInt();
		String strName1= scanner.next();
		String strName2= scanner.next();
		String strName3= scanner.next();
		String strName4= scanner.next();
		String strName5= scanner.next();
		
		
		Student student=new Student(roll,strName1);
		Address address=new Address(strName2,strName3,strName4,strName5);
		student.display();
		address.display();
		
	}
}
