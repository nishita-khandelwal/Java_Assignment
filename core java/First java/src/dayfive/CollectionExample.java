package dayfive;
import java.util.*;
public class CollectionExample {
	public static void main(String args[]) {
	Vector<Integer> vector=new Vector<>();
	vector.add(12);
	vector.add(4653);
	vector.add(876);
	vector.add(4344);
	vector.add(433);
	vector.add(765);
	vector.add(5254);
	vector.add(654656);
	System.out.println(vector);  //using to string
	
	for(Integer y:vector)
	{
		System.out.println(y);
	}
	
	Iterator<Integer> iterator=vector.iterator();
	
		
		while(iterator.hasNext()) 
		{
			System.out.println(iterator.next()+" ");
		}
	
	
	
	}
}
