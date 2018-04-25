package collectionAPI_17;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

/*HashMap :under lying data structure HashTable, 
 * non-synchronised methods,
 * not-thread-safe, 
 * high performance; 
 * null-insertion;
 * insertion order not preserved
   key will be unique, values can be redundant.*/
//HashTable is opposite to HashMap.
public class HashMapDemo 
{
	public static void main(String[] args)
	{
		HashMap m = new HashMap();
		m.put(null, "RAMAN");
		m.put(101, "AMAN");
		m.put(102, "BOB");
		m.put(103, "JOHN");
		m.put(104, "PHILLIP");
		m.put(105, "AMAN");       //key different value same.
		m.put(101, "NAMAN");      //It will override 101-"AMAN"
		System.out.println(m);    //Order not preserved.
		
		Set s = m.keySet();
		System.out.println(s);
		
		Collection c = m.values();
		System.out.println(c);
		
		Set e = m.entrySet();
		System.out.println(e);
		
		Iterator itr = e.iterator();
		while(itr.hasNext())
		{
			Map.Entry me = (Map.Entry)itr.next();
			System.out.println(me.getKey()+"---"+me.getValue());
			if(me.getKey().equals(101))
			{
				me.setValue("RAMAN");
			}
		}
		System.out.println(e);
	}
}
