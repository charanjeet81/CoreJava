package collectionAPI_17;

import java.util.Enumeration;
import java.util.Vector;

/*
 * 
 * There are 3 Cursors in java: Enumeration, Iterator, ListIterator
 * Cursors are used to deal with elements/objects one-by-one.
 * Enumeration, is used with legacy classes like: Vector.
 * Drawback of Enumeration, we can only retrieve elements no other operation like remove.
 * */



public class EnumerationDemo 
{
	public static void main(String[] args) 
	{
		Vector v = new Vector();
		for(int i=0; i<=10; i++)
		{
			v.add(i);
		}
		System.out.println(v);
		System.out.println("Checking for Even");
		Enumeration e = v.elements();
		while(e.hasMoreElements())
		{
			Integer i = (Integer)e.nextElement();
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
		System.out.println(v);    //No element is removed.
	}
}
