package collectionAPI_17;

import java.util.Comparator;
import java.util.TreeSet;

//Comparator is used for customised comparison.
class MyComparator implements Comparator
{
	public int compare(Object o1, Object o2)
	{
		Integer i1 = (Integer)o1;
		Integer i2 = (Integer)o2;
		if(i1>i2)
			return -1;
		else if(i1<i2)
			return +1;
		else
			return 0;	
	}	
}
public class ComparatorDemo {
	public static void main(String[] args)
	{
		TreeSet t = new TreeSet();
		t.add(7);
		t.add(3);
		t.add(4);
		t.add(9);
		t.add(5);		
		System.out.println("Increasing Order :"+t);   //output will be in increasing order.
		
		TreeSet t1 = new TreeSet(new MyComparator());
		t1.add(7);
		t1.add(3);
		t1.add(4);
		t1.add(9);
		t1.add(5);		
		System.out.println("Decreasing Order :"+t1);   //output will be in decreasing order.
	}
}

