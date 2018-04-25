package equals_10;
//If want to make your own immutable object, it will be wiser to override the equals() and hashCode() methods. 
//1. java.util.Hashtable extends Dictionary and implements Map. Objects with non-null value 
//   can be used as a key or value. Key of the Hashtable must implement hashcode() and equals() methods.
//2. Generally a Hashtable in java is created using the empty constructor Hashtable(). Which is a poor decision and an often repeated mistake. 
//3. Hashtable has two other constructors: Hashtable(int initialCapacity) & Hashtable(int initialCapacity, float loadFactor)
//4. Initial capacity is number of buckets created at the time of Hashtable instantiation. Bucket is a logical space of storage for Hashtable. 
//5. Hashtable is a key-value pair, you need not sequentially scan through the keys to identify a value.
//6. The general contract of hashCode is: Whenever it is invoked on the same object more than once during an execution of a Java application, 
//   the hashCode method must consistently return the same integer, provided no information used in equals comparisons on the object is modified.  
//7. For two different keys k1 and k2, if we have h(k1) = h(k2), then this is called collision in hashtable.
//8. To name a few hashtable collision resolution technique, separate chaining, open addressing, robin hood hashing, cuckoo hashing, etc. 
//   Java's hashtable uses separate chaining for collision resolution in Hashtable.
import java.util.HashSet;

class Emp 
{
	private int age;
	
	public Emp(int age)
	{
		super();
		this.age = age;
	}	
	
	public int hashCode()
	{
		return age;
	}
	
	public boolean equals(Object obj)
	{
		boolean flag = false;
		Emp emp = (Emp)obj;
		if(emp.age == age)
			flag = true;
		return flag;
	}
}

public class TestEmp
{
	public static void main(String[] args) 
	{
		Emp emp1 = new Emp(23);
		Emp emp2 = new Emp(24);
		Emp emp3 = new Emp(25);
		Emp emp4 = new Emp(26);
		Emp emp5 = new Emp(27);
		HashSet<Emp> hs = new HashSet<Emp>();
		hs.add(emp1);
		hs.add(emp2);
		hs.add(emp3);
		hs.add(emp4);
		hs.add(emp5);
		
		// Output will be different if hashCode() and equals() are not implemented.
		System.out.println("HashSet Size--->>>"+hs.size());                              //5
		System.out.println("hs.contains( new Emp(25))--->>>"+hs.contains(new Emp(25)));  //T
		System.out.println("hs.remove( new Emp(24)--->>>"+hs.remove(new Emp(23)));       //T
		System.out.println("hs.contains( new Emp(25))--->>>"+hs.contains(emp3));         //T
		System.out.println("hs.remove( new Emp(23)--->>>"+hs.remove(emp1));              //F
		System.out.println("Now HashSet Size--->>>"+hs.size());                          //4
	}
}