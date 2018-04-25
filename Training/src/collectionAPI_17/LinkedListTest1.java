package collectionAPI_17;

import java.util.Collections;
import java.util.LinkedList;

/*LinkedList: underlying data-structure is doubly-linklist .
 * insertion order is preserved 
 * duplicacy is allowed
 * Heterogeneous objects are allowed(except TreeSet & TreeMap)  
 * Null insertion is allowed
 * LinkedList is best suited for insertion and deletion but not for retrieval.
 * implement Serializable, Cloneable but not RandomAccess marker interface.
 * 
 * */

public class LinkedListTest1 
{
	public static void main(String[] args) 
	{
		LinkedList l = new LinkedList();
		l.add(4);
		l.add('B');
		l.addFirst("Hello");
		l.add('B');
		l.addLast("Hi");
		
		System.out.println(l);
		System.out.println("Size is : "+l.size());
		System.out.println("Element at second index :"+l.get(2));
		System.out.println("Index of 'Hello' :"+l.indexOf("Hello"));
		System.out.println("last Element :"+l.getLast());
		System.out.println("First element get removed :"+l.remove());  //remove() works like removeFirst()
		System.out.println("New List :"+l);
		l.clear();
		System.out.println("After clear() :"+l);
		l.add(0, 'X');  //return type void.
		l.add(1, 'Y');  // will add new value
		l.set(1, 'Z');  //return type object.(sets value in existing one, It won't add new value.)
		System.out.println(l);
		
		System.out.println("----------------------------");
		LinkedList<Integer> l1 = new LinkedList<Integer>();
		l1.add(8);
		l1.add(5);
		//l1.add('L');  you can't add anything other than Integer.
		l1.add(2, 7);
		System.out.println("Integer LinkedList 'Ordered but not sorted' :"+l1);
		
		System.out.println("----------------------------");
		LinkedList<String> l2 = new LinkedList<String>();
		l2.add("Hello");
		l2.add("Hi");
		//l1.add(4);  you can't add anything other than String.
		l2.add(2, "Bye");
		System.out.println("String LinkedList 'Ordered but not sorted' :"+l2);
		
	}
}
