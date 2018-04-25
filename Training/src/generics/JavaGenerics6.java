package generics;

// Bounded Type; We can bound the type for a particular range like: for its sub class. 
class Test1<T extends Number> {  }                 // Class - Allowed
class Test2<T extends Runnable> {  }               // Interface - Allowed
class Test3<T extends Runnable & Comparable> {  }  // Both Interfaces - Allowed
class Test4<T extends Number & Runnable> {  }      // Class then Interfaces - Allowed
class Test5<T extends Number & Runnable & Comparable> {  }    // Class then Interfaces - Allowed
// class Test6<T extends Runnable & Number> {  }              // Interface then Class - Not Allowed
// class Test6<T extends Thread & Number> {  }                // Both Class - Not Allowed

class GenTest<T>
{
	public <T extends Number & Runnable & Comparable> void fxn(T obj)  // Same rule holds true here as well.
	{
		
	}
}

abstract class ABC extends Number implements Runnable
{
	public void run() { }
}

class Test<X, Y, Z extends Number>
{
	
}


class JavaGenerics6 
{
	public static void main(String args[])
	{
		Test1<Integer> t1 = new Test1<Integer>();
		Test1<Float> t2 = new Test1<Float>();
		// Test1<String> t3 = new Test1<String>();
		
		Test2<Runnable> t4 = new Test2<Runnable>();
		Test2<Thread> t5 = new Test2<Thread>();
		// Test2<Integer> t6 = new Test2<Integer>();
		
		Test4<ABC> t6 = new Test4<ABC>();
		
		Test<Integer, Float, Short> t = new Test<Integer, Float, Short>();
	}
}