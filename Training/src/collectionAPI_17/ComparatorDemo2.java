package collectionAPI_17;

import java.util.Comparator;
import java.util.TreeSet;

class MyComparator1 implements Comparator
{
	public int compare(Object o1, Object o2)
	{
		Integer i1 = (Integer)o1;
		Integer i2 = (Integer)o2;
		
		/*----Run one return at one time---*/
		
		//return i1.compareTo(i2);         // Increasing Order
		//return -i1.compareTo(i2);        // Decreasing Order
		return i2.compareTo(i1);           // Decreasing Order
		//return -i2.compareTo(i1);		   // Increasing Order
		//return +1;					   //same as insertion order
		//return -1;					   //reverse to insertion order
		//return 0;                        //Displays first element.	
	}
}

public class ComparatorDemo2 
{
	public static void main(String[] args) 
	{
		TreeSet t1 = new TreeSet(new MyComparator1());
		t1.add(7);
		t1.add(3);
		t1.add(4);
		t1.add(9);
		t1.add(5);		
		System.out.println("Order depends on return type :"+t1); 
	}
}
