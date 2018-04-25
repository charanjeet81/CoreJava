package designPattern.creationalDesignPattern;

/*Lazy Initialization will not create any object at class loading time rather when it is asked for creation and that too,
if it is null then only it will create object.*/

/*The above implementation works fine incase of single threaded environment but when it comes to multithreaded systems, 
it can cause issues if multiple threads are inside the if loop at the same time. It will destroy the singleton pattern
and both threads will get the different instances of singleton class. In next section, we will see different ways to
create a thread-safe singleton class.*/

class LazyInitialization
{
	private static LazyInitialization obj;
	
	private LazyInitialization() { }
	
	void anyMethod()
	{
		System.out.println("Can't use with direct object creation--LazyInitialization.");
	}
	
	public static LazyInitialization getInstance()
	{
		if(obj==null)
			obj = new LazyInitialization();
		return obj;
	}
}

public class SDP3_LazyInitialization 
{
	public static void main(String[] args) 
	{
		LazyInitialization.getInstance().anyMethod();
	}
}
