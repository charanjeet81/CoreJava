package generics;
// Primitives are not allowed in generics.
// Arrays are type-safe but collections are not.
// Collections is a class whereas Collection is an interface.
    /*     Collection
         /     |      \
        AL     LL    Vector
                       |
                     Stack*/
import java.util.*;


class Gen<X>
{
	X obj;
	
	public Gen(X obj)
	{
		this.obj = obj;
	}
	
	public void show()
	{
		System.out.println("Displaying Class Name: "+obj.getClass().getSimpleName());
	}
	
	public X getObject()
	{
		return obj;
	}
}

class JavaGenerics5 
{
	public static void main(String args[])
	{
		Gen<String> a = new Gen<String>("String-Value");
		a.show();
		System.out.println("Displaying Object: "+a.getObject());
		
		Gen<Float> b = new Gen<Float>(3.14f);
		b.show();
		System.out.println("Displaying Object: "+b.getObject());
		
		Collection<String> l5 = new ArrayList<String>();
		List<String> l1 = new ArrayList<String>();
		List<Integer> l2 = new LinkedList<Integer>();
		List<String> l3 = new Vector<String>();
		List<String> l4 = new Stack<String>();
	}
}