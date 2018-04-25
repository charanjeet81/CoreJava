package designPattern.creationalDesignPattern;


/*Static block initialization implementation is similar to eager initialization, except that instance of class is 
created in the static block that provides option for exception handling.*/

/*Both eager initialization and static block initialization creates instance even before it’s being used and that is not
best practice to use. So further sections, will learn how to create Singleton class that supports lazy initialization.*/

class StaticBlockInitialization
{
	private static StaticBlockInitialization obj ;
	
	private StaticBlockInitialization() { }
	
	static
	{
		try {
			obj = new StaticBlockInitialization();					
		} catch (Exception e) {
			throw new RuntimeException("Exception occured in creating singleton instance.");
		}		
	}
	
	void anyMethod()
	{
		System.out.println("Can't use with direct object creation--StaticBlockInitialization.");
	}
	
	public static StaticBlockInitialization getInstance()
	{
		return obj;
	}
}

public class SDP2_StaticBlockInitialization 
{
	public static void main(String[] args) 
	{
		//EagerInitialization obj = new EagerInitialization(); //can't make object.
		StaticBlockInitialization.getInstance().anyMethod();
	}
}


