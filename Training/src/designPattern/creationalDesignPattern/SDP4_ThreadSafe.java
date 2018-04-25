package designPattern.creationalDesignPattern;

/*The easier way to create a thread-safe singleton class is to make the global access method synchronized, so that only 
one thread can execute this method at a time.*/

class SynchronizedMethod
{
	private static SynchronizedMethod obj;

	private SynchronizedMethod() { }
	
	void anyMethod()
	{
		System.out.println("Can't use with direct object creation--SynchronizedMethod.");
	}
	
	public static synchronized SynchronizedMethod getInstance()
	{
		if(obj==null)
			obj = new SynchronizedMethod();
		return obj;
	}
}

/*Above implementation works fine and provides thread-safety but it reduces the performance because of cost associated 
with the synchronized method, although we need it only for the first few threads who might create the separate 
instances (Read: Java Synchronization). To avoid this extra overhead every time, double checked locking principle is 
used. In this approach, the synchronized block is used inside the if condition with an additional check to ensure that 
only one instance of singleton class is created.*/

class SynchronizedBlock
{
	private static SynchronizedBlock obj;

	private SynchronizedBlock() { }
	
	void anyMethod()
	{
		System.out.println("Can't use with direct object creation--SynchronizedBlock.");
	}
	
	public static SynchronizedBlock getInstance()
	{
		if(obj == null)
		{
	        synchronized (SynchronizedBlock.class) 
	        {
	            if(obj == null)
	            	obj = new SynchronizedBlock();
	        }
	    }
	    return obj;
	}
}

public class SDP4_ThreadSafe 
{
	public static void main(String[] args) 
	{
		SynchronizedMethod.getInstance().anyMethod();
		SynchronizedBlock.getInstance().anyMethod();
	}
}
