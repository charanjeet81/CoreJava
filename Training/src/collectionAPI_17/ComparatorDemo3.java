package collectionAPI_17;
//How to reverse the alphabatic order for StringBuffer ?(because you can't compare 
//StringBuffer and StringBuilder object as they don't implement Comparable interface. )
import java.util.Comparator;
import java.util.TreeSet;


class MyComp implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		String i1 = o1.toString();
		String i2 = o2.toString();
		return i2.compareTo(i1);
	}
}

public class ComparatorDemo3 
{
	public static void main(String[] args) 
	{
		TreeSet t = new TreeSet(new MyComp());
		t.add(new StringBuffer("AB"));
		t.add(new StringBuffer("BB"));
		t.add(new StringBuffer("BC"));
		t.add(new StringBuffer("AC"));
		t.add(new StringBuffer("ZA"));
		System.out.println(t);  //Alphabatic increase, if compare() is not implemented.
	}

}
