package others_14;

//1. Finalized method is called by the garbage collector on an object when garbage collection determines that there are no more references to the object.
//syntax : protected void finalize() throws Throwable 
// 2. Then the corresponding class' finalize() will be called on that object.


/*public class GCTest 
{
	public static void main(String[] args)
	{
		String s = new String("AmazingJava");
		s = null;
		System.gc();
		System.out.println("End of main().");
	}
	public void finalize()
	{
		System.out.println("finalize() run.");
	}
}*/

//Expected: finalize() run
//          AmazingJava
//Acctual: AmazingJava
//finalize() run won't be call because finalize() of String will be called, not of GCTest class.

//-------------------------------------------------

/*public class GCTest 
{
	public static void main(String[] args)
	{
		GCTest t = new GCTest();
		t = null;
		System.gc();
		System.out.println("End of main().");
	}
	
	public void finalize()   //finalize() of GCTest level.
	{
		System.out.println("finalize()");
	}
}*/

//----------------------------------------------

/*class GCTest
{
	public static void main(String[] args)
	{
		GCTest t1 = new GCTest();
		GCTest t2 = new GCTest();
		t1.finalize();  //You can explicitly call finalize(), but it will work as normal method, no cleanup.
		t2.finalize();  //explicitly call
		t1 = null;      //implicitly call
		t2 = null;      //implicitly call
		System.gc();
		System.out.println("End of main().");
	}
	public void finalize()   //finalize() of GCTest level.
	{
		System.out.println("finalize()");
	}
}*/

//--------------------------------------------
/*
class GCTest
{
	public static void main(String[] args)
	{
		GCTest t = new GCTest();
		//t.finalize();   //If finalize() is called explicitly, then it will behave as simple method and terminate abnormally throwing Exception.
		t = null;
		System.gc();    //If finalize() is called implicitly, then it terminates normally and handle uncaught Exception. 
		System.out.println("End of main()");	
	}
	public void finalize()
	{
		System.out.println("finalize()");
		System.out.println(10/0);
	}
}*/


//----------------------------------------------


// gc() is called twise but is calling finalize() once for one object(references are two in number).
//  
class GCTest
{
	static GCTest t1 ;
	public static void main(String[] args) throws InterruptedException
	{
		GCTest t2 = new GCTest();
		
		// System.out.println(t1.hashCode());  // null-pointer-exception, because it does not have any object referenced, it only have 
		
		System.out.println(t2.hashCode());
		t2 = null;
		System.gc();
		// System.out.println(t2.hashCode());
		
		Thread.sleep(3000);
		
		// System.out.println(t1.hashCode());
		t1 = null;
		System.gc();
		// System.out.println(t1.hashCode());
		
		Thread.sleep(3000);
		System.out.println("End of main()");
	}
	public void finalize()
	{
		System.out.println("finalize()");
		t1 = this;
	}
}

/*
		String s1 = new String("helo");
		String s2 = new String("helq");
		System.out.println("-------------");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println("-------------");
*/





















