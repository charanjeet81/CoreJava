package collectionAPI_17;

import java.util.ArrayList;
import java.util.Iterator;


/*Limitations of Iterator:
 * Enumeration and Iterator both are one-directional moves forward only, can't do backward.
 * Iterator do read and remove but can't do replace and add of elements. * 
 * */
public class IteratorDemo 
{
	public static void main(String[] args) 
	{
		ArrayList l = new ArrayList();
		for(int i=0; i<=10;i++)
		{
			l.add(i);
		}
		System.out.println("Main list :"+l);
		System.out.println("Checking for Even");
		Iterator itr = l.iterator();
		while(itr.hasNext())
		{
			Integer i = (Integer)itr.next();
			if(i%2==0)
			{
				System.out.println(i);
			}
			else
			{
				itr.remove();
			}
		}
		System.out.println("Main list after using remove() :"+l);
	}
}
