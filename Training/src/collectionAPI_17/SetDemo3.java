package collectionAPI_17;

import java.util.HashSet;
import java.util.LinkedList;

public class SetDemo3 
{
	public static void main(String[] args)
	{
		LinkedList l = new LinkedList();
		l.add(4);
		l.add('B');
		l.add("Hello");
		System.out.println(l);
		
		HashSet h = new HashSet();
		h.add('B');
		h.add('M');
		h.add("Hi");
		h.add(7);
		System.out.println(h.add("Hi")); //adding duplicate object
		System.out.println(h);           //Output order is not as same as insertion order.
	    
		h.addAll(l);             //will add all LinkList contents to HashSet.
	    System.out.println(h);   //combined output in random order, with no duplicate object.
		

	}

}
