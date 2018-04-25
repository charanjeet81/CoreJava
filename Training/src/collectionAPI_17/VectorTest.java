package collectionAPI_17;

import java.util.Vector;

/*Vector is as same as ArrayList, except methods of Vector class are thread-safe, synchronized, slow at runtime.
 * Vector is Growable array, 
 * insertion order is preserved 
 * duplicacy is allowed
 * Heterogeneous objects are allowed(except TreeSet & TreeMap)  
 * Null insertion is allowed
 * ArrayList is best suited for retrieval not for insertion and deletion. 
 * implement Serializable, Clonable and RandomAccess marker interface.
 *what else function?
 *Vector v = new Vector();   //new_capcity = 2*old_capcity
 *Vector v = new Vector(capacity);
 *Vector v = new Vector(capacity, increment-factor);
 * */


public class VectorTest 
{
	public static void main(String[] args) 
	{
		Vector v = new Vector(5,4);        //with capacity 5 & increment factor 4
		System.out.println("Initial Capacity & size:"+v.capacity()+" & "+v.size());  //5
		for(int i=1; i<=5;i++)
		{
			v.addElement(i);
		}
		v.addElement("Java");              //sixth element, but make capacity as 5+4=9
		System.out.println("All Vector Elements :"+v);  
		System.out.println("New Capacity & size:"+v.capacity()+" & "+v.size());  //9
		
		System.out.println(v.contains("Hello"));  
		v.clear();                             //clearing it.
		System.out.println(v.isEmpty());       //true
	}

}
