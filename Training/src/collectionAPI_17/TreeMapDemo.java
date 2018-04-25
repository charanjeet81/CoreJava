package collectionAPI_17;

import java.util.Comparator;
import java.util.TreeMap;
//TreeMap: under lying data structure is RED-BLACK tree.
public class TreeMapDemo 
{
	public static void main(String[] args) 
	{
		TreeMap t = new TreeMap(new MyComp4()); //If you will not pass "new MyComp4()" then it will show ascending order.
		t.put(101, "AB");
		t.put(104, "EF");
		t.put(102, "CD");
		t.put(103, "XZ");
		t.put(103, "XY");     //duplicate key will override latest value.
		//t.put("LK", "XZ");  //ClassCastException, because non-comparable Key. 
		//t.put(null, "AB");  //NullPointerException, allowed in first Entry only
		
		System.out.println(t);
	}

}
class MyComp4 implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		Integer i1 = (Integer)o1;
		Integer i2 = (Integer)o2;
		return i1.compareTo(i2);
	}
	

}
