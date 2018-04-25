package collectionAPI_17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


// How to make methods of ArrayList synchronised ?

public class ArrayListTest3 
{
	public static void main(String[] args)
	{
		ArrayList l1 = new ArrayList();
		List l2 = Collections.synchronizedList(l1);
		//in the same way you can make Set and Map's methods synchronised.
	}

}
