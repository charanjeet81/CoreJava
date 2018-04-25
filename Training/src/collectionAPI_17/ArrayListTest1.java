
/*ArrayList: Growable array, grow dynamically
 * insertion order is preserved 
 * duplicacy is allowed
 * Heterogeneous objects are allowed(except TreeSet & TreeMap)  
 * Null insertion is allowed
 * ArrayList is best suited for retrieval not for insertion and deletion. 
 * implement Serializable, Clonable and RandomAccess marker interface.
 * 
 * */
package collectionAPI_17;

import java.util.ArrayList;

public class ArrayListTest1 
{
	public static void main(String[] args) 
	{
		ArrayList l = new ArrayList();
		l.add('A');
		l.add(9);
		l.add("Hello");
		l.add('M');
		l.add(null);
		System.out.println(l.size());
		System.out.println(l);  // insertion order is preserved 
		
		l.remove(3);
		System.out.println(l);
		
		l.add(3, 'N');
		System.out.println(l);
		
		System.out.println(l.contains('N'));
		
		l.clear();
		System.out.println(l);
		
		//System.out.println(l.get(1));
		//System.out.println(l.indexOf(null));
		System.out.println(l.contains('P'));
	}
}
