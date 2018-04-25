package collectionAPI_17;

import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetDemo6 
{
	public static void main(String[] args) 
	{
	 SortedSet ss = new TreeSet();
	 ss.add(101);
	 ss.add(107);
	 ss.add(109);
	 ss.add(107);              //duplicate, but won't get added.
	 ss.add(110);
	 ss.add(103);
	 //ss.add("A");            //can't add here.
	 System.out.println(ss);   //It will auto-sort your elements and print it.
	 //----------------------SortSet Methods---------------------------//
	 System.out.println("first()      :"+ss.first()); 
	 System.out.println("last()       :"+ss.last()); 
	 System.out.println("headSet()    :"+ss.headSet(107)); 
	 System.out.println("tailSet()    :"+ss.tailSet(107)); 
	 System.out.println("subSet()     :"+ss.subSet(103, 109)); 
	 System.out.println("comparator() :"+ss.comparator()); 	 
	 
	 SortedSet ss1 = new TreeSet();
	 ss1.add("AC");
	 ss1.add("AB");
	 ss1.add("C");
	 ss1.add("B");
	 System.out.println(ss1);   //It will auto-sort your elements in dictionary order.
	}

}
