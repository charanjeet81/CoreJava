package collectionAPI_17;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetDemo2 
{
	public static void main(String[] args) 
	{
		HashSet h = new HashSet();
		h.add('B');
		h.add('M');
		h.add("Hi");
		h.add(7);
		System.out.println(h.add("Hi")); //adding duplicate object gives false.
		System.out.println(h);           //Output order is not as same as insertion order.

		//LinkedHashSet is a combination of LinkedList and HashSet.
		//For LinkedHashSet insertion order is preserved with no duplicate object.
		LinkedHashSet h1 = new LinkedHashSet();
		h1.add('B');
		h1.add('M');
		h1.add("Hi");
		h1.add(7);
		System.out.println(h1.add("Hi")); //adding duplicate object gives false.
		System.out.println(h1);           //Output order is preserved.
	}

}
