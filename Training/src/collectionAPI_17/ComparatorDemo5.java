package collectionAPI_17;
//Arrange By Id and Name separately.
import java.util.Comparator;
import java.util.TreeSet;

class Employee implements Comparable
{
	Integer id;
	String name;
	Employee(Integer id, String name)
	{
		this.id = id;
		this.name = name;
	}
	public String toString()
	{
		return id+" - "+name;
	}
	public int compareTo(Object o)
	{
		int id1 = this.id;
		Employee e = (Employee)o;
		int id2 = e.id;
		if (id1<id2)
			return -1;
		else if(id1>id2)
			return +1;
		else
			return 0;			
	}
}

class MyComp2 implements Comparator
{
	public int compare(Object o1, Object o2)
	{
		String n1 = ((Employee)o1).name;
		String n2 = ((Employee)o2).name;
		return n1.compareTo(n2);
	}
	
}


public class ComparatorDemo5 
{
	public static void main(String[] args)
	{
		Employee e1 = new Employee(102, "AMAN");
		Employee e2 = new Employee(101, "BOB");
		Employee e3 = new Employee(103, "JOHN");
	
		TreeSet t1 = new TreeSet(); 
		t1.add(e1);
		t1.add(e2);
		t1.add(e3);
		System.out.println("Sort By Id :"+t1);
		
		TreeSet t2 = new TreeSet(new MyComp2()); 
		t2.add(e1);
		t2.add(e2);
		t2.add(e3);
		System.out.println("Sort By Name :"+t2);

	}

}
