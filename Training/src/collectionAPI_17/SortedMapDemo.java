package collectionAPI_17;

import java.util.SortedMap;
import java.util.TreeMap;


//SortedMap :is also like Map, K-V, do some sorting based on keys. 
public class SortedMapDemo 
{
	public static void main(String[] args) 
	{
		SortedMap sm = new TreeMap();
		sm.put(102, "HI");
		sm.put(103, "HEY");
		sm.put(101, "HELLO");
		
		System.out.println(sm);  //It do some natural sorting based on TreeMap.

	}

}
