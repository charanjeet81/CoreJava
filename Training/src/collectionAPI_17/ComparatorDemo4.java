package collectionAPI_17;

import java.util.Comparator;
import java.util.TreeSet;

//Arrange the inputs in increasing length, if length is same then alphabetically.
public class ComparatorDemo4 
{
	public static void main(String[] args)
	{
		TreeSet t = new TreeSet(new MyComp1());
		t.add("AMAN");
		t.add("RAMAN");
		t.add("NAMAN");
		t.add("RAM");
		t.add("PHILLIP");
		System.out.println(t);    //It will simply arrange alphabetically if comparator is not implemented.
	}
}

class MyComp1 implements Comparator
{
	public int compare(Object o1, Object o2)
	{
		String s1 = o1.toString();
		String s2 = o2.toString();
		int l1 = s1.length();
		int l2 = s2.length();
		if(l1<l2)
		{
			return -1;
		}
		else if(l2<l1)
		{
			return +1;
		}
		else
			return s1.compareTo(s2);
	}
}
