package generics;

import java.util.ArrayList;
import java.util.List;

public class JavaGenerics8 
{
	// Both are not over loaded.
	// public void m(ArrayList<String> l) { }
	// public void m(ArrayList<Integer> l) { }
	
	public static void m2(ArrayList l)
	{
		l.add(4.23);
		l.add(true);
		System.out.println(l);
	}
	
	public static void main(String[] args) 
	{
		ArrayList<String> l = new ArrayList<String>();
		l.add("hello");
		l.add("hey");
		//l.add(4.23);
		l.add("hi");   
		//l.add(true);
		m2(l);   // Calling non-generic from generic, from non-generic area you can add anything/any type of value.
		
		ArrayList l1 = new ArrayList<String>();
		// It is non-generic as same as ArrayList l1 = new ArrayList<Integer>(); and ArrayList l1 = new ArrayList();
		// ArrayList<String> l1 = new ArrayList(); is as sam as ArrayList<String> l1 = new ArrayList<String>();
		l1.add("hello");
		l1.add("hey");
		l1.add(4.23);
		l1.add("hi");   
		l1.add(true);
	}
}
