package collectionAPI_17;
/*for using TreeSet your elements should be Comparable or it should implement Comparator class.
 * All String classes and Wrapper classes implements Comparable and Serializable 
 * interface but StringBuffer and StringBuilder class don't implement Comparable so it give "ClassCastException".
 * t.add(new StringBuilder("A"));
   System.out.println(t);      //"ClassCastException"
 */


import java.util.TreeSet;

public class SetDemo5 
{
	public static void main(String[] args) 
	{
		TreeSet t = new TreeSet();
		t.add(new StringBuilder("B"));
		t.add(new StringBuilder("a"));
		t.add(new StringBuilder("A"));
		System.out.println(t);      //"ClassCastException"
	}
}
