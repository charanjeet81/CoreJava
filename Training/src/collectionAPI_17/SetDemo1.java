package collectionAPI_17;

import java.util.HashSet;
import java.util.LinkedList;

/*
 * Set: In set duplicacy of elements is not allowed, insertion order is not preserved.
 * HashSet: underlying data-structure is 'hashtable' .
 * insertion order is not preserved, it is based on hashcode. 
 * duplicacy is not allowed, for duplicate object you will not get any exception but you will get 'false'.
 * Heterogeneous objects are allowed(except in TreeSet)  
 * Null insertion is allowed
 * HashSet is best suited for searching.
 * HashSet implement Serializable, Cloneable but not RandomAccess marker interface.
 * 
 * */


public class SetDemo1 
{
	public static void main(String[] args) 
	{
		HashSet h = new HashSet();
		h.add('B');
		h.add('M');
		h.add('B');
		h.add("Hi");
		h.add(7);
		h.add('B');
		h.add(null);
		System.out.println(h.add("Hi")); //adding duplicate object
		System.out.println(h);           //Output order is not as same as insertion order.
	}

}
