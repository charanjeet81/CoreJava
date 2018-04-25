package generics;

//Java Generics is used to deal with type-safe objects. Before generics, we can store any type of objects 
//in collection i.e. non-generic. Now generics, forces the java programmer to store specific type of objects.
//Advantage of Java Generics:
/*1)	Type-safety : We can hold only a single type of objects in generics. It does not allow to store other objects.
2)	Type casting is not required: There is no need to typecast the object.
Before Generics, we need to type cast.

List list = new ArrayList();  
list.add("hello");  
String s = (String) list.get(0);//Explicit typecasting  
3)	Compile-Time Checking than run time*/

import java.util.*;

class JavaGenerics1 {
	public static void main(String args[])
	{
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "vijay");
		map.put(4, "umesh");
		map.put(2, "ankit");

		// Now use Map.Entry for Set and Iterator
		Set<Map.Entry<Integer, String>> set = map.entrySet();

		Iterator<Map.Entry<Integer, String>> itr = set.iterator();
		while (itr.hasNext()) {
			Map.Entry e = itr.next();// no need to typecast
			System.out.println(e.getKey() + " " + e.getValue());
		}
		
		
	}
}  