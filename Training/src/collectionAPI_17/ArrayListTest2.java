package collectionAPI_17;
/*ArrayList class implement RandomAccess because it provides random accessing facility,
but LinkedList does not.
There is no difference between ArrayList and Vector class except all methods of 
Vector class is synchronized means thread-safe means slow  in execution.*/

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.RandomAccess;

public class ArrayListTest2 
{
	public static void main(String[] args) 
	{
		ArrayList l1 = new ArrayList();
		System.out.println(l1 instanceof Serializable);
		System.out.println(l1 instanceof Cloneable);
		System.out.println(l1 instanceof RandomAccess);
		
		LinkedList l2 = new LinkedList();
		System.out.println(l2 instanceof Serializable);
		System.out.println(l2 instanceof Cloneable);
		System.out.println(l2 instanceof RandomAccess);
	}
}
