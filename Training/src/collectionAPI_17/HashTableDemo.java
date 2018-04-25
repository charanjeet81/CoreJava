package collectionAPI_17;

import java.util.Hashtable;



//HashTable :
public class HashTableDemo 
{
	public static void main(String[] args)
	{
		Hashtable h = new Hashtable();
		h.put(new Tempp(0), "A");
		h.put(new Tempp(1), "B");
		h.put(new Tempp(3), "D");
		h.put(new Tempp(5), "L");
		h.put(new Tempp(16), "M");
		h.put(new Tempp(18), "P");
		System.out.println(h);
		
		Hashtable t = new Hashtable();
		t.put(1, "A");
		t.put(2, "B");
		t.put(5, "D");
		System.out.println(t);
	}
}
class Tempp
{
	int i;
	Tempp(int i)
	{
		this.i = i;
	}
	public String toString()
	{
		return i+"";
	}
	public int hashcode()
	{
		return i;
	}
	
}
