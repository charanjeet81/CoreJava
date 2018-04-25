package collectionAPI_17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListTest4 
{
	public static void main(String[] args) 
	{
		List<String> l = new ArrayList<String>();
		l.add("BOB");
		l.add("JOHN");
		l.add("AAMIR");
		l.add("TOM");
		System.out.println("Unsorted :"+l);
		Collections.sort(l);
		System.out.println("Sorted :"+l);
	}
}
