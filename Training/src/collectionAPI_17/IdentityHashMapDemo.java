package collectionAPI_17;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;

public class IdentityHashMapDemo 
{
	public static void main(String[] args) 
	{
		Integer i1 = new Integer(101);
		Integer i2 = new Integer(101);
		Integer i3 = new Integer(101);
		
		HashMap h = new HashMap();
		h.put(i1, "HI");
		h.put(i2, "HELLO");
		h.put(i2, "HEY");
		System.out.println("HashMap output :"+h);//It will give overridden key-value pair. 
		                      //It checks values of key by equals().
		IdentityHashMap l = new IdentityHashMap();
		l.put(i1, "HI");
		l.put(i2, "HELLO");
		System.out.println("LinkedHashMap output :"+l);
		                      //It checks reference of key by "==". It will duplicate key. 
	}

}
