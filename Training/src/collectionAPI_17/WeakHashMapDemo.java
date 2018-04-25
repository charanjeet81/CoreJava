package collectionAPI_17;

import java.util.HashMap;
import java.util.WeakHashMap;

//HashMap dominate over garbage collector, even if there is no object reference.
//WeakHashMap does not dominate over garbage collector.

public class WeakHashMapDemo 
{
	public static void main(String[] args) throws InterruptedException
	{
		Temp t1 = new Temp();		
		HashMap h = new HashMap();
		h.put(t1, "Java");
		System.out.println(h);
		t1 = null;
		System.gc();       		 //calling garbage collector.
		Thread.sleep(4000);
		System.out.println("After four second :");
		System.out.println(h);
		
		System.out.println("-------------------------");
		
		Temp t2 = new Temp();
		WeakHashMap w = new WeakHashMap();
		w.put(t2, "Java");
		System.out.println(w);
		t2 = null;
		System.gc();            //calling garbage collector.
		Thread.sleep(4000);
		System.out.println("After four second :");
		System.out.println(w);
	}
}
class Temp
{
	public String toString()
	{
		return "temp";
	}
	public void finalize()
	{
		System.out.println("Finalize run before gc().");
	}
}
