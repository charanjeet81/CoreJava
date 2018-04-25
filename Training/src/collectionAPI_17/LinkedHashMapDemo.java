package collectionAPI_17;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

//LinkedHashMap's underlying data structure is "LinkedList" and "HashTable".
//Only difference between HashMap and LinkedHashMap is in LinkedHashMap insertion order is preserved.
public class LinkedHashMapDemo 
{
	public static void main(String[] args)
	{
		LinkedHashMap m = new LinkedHashMap();
		m.put(101, "AMAN");
		m.put(105, "AMAN");       //key different value same.
		m.put(102, "BOB");
		m.put(103, "JOHN");
		m.put(104, "PHILLIP");
		m.put(101, "NAMAN");      //It will override 101-"AMAN"
		System.out.println(m);    //Order is preserved.
		
		Set s = m.keySet();
		System.out.println("keySet() :"+s);
		
		Collection c = m.values();
		System.out.println("values() :"+c);
		
		Set e = m.entrySet();
		System.out.println("entrySet() :"+e);
		
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
