package collectionAPI_17;
/*TreeSet : underlying data structure is balanced tree.
no duplicacy of elements.
insertion order is not preserved.
Hetrogeneous elements are not allowed for TreeSet.
TreeSet t = new TreeSet();              It does natural sorting.
TreeSet t = new TreeSet(Comparator c);  It does customised sorting.*/
import java.util.TreeSet;

public class SetDemo4 
{
	public static void main(String[] args)
	{
		TreeSet t = new TreeSet();
		t.add('A');
		t.add('a');
		t.add('B');
		t.add('Z');
		t.add('K');
		//t.add(7);      If you will add some heterogeneous data then "ClassCastException"
		//t.add(null);   NullPointerException
		System.out.println(t);   //Arranged according to ASCII value.
	}
}
