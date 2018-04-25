package BlocksExe_2;

class SampleClass   
{
	static 
	{
		System.out.println("First static-block");
	}	
	
	void show()
	{
		System.out.println("This is a instance method.");
	}
	
	static void display()
	{
		System.out.println("This is a static method.");
	}
	
	static 
	{
		System.out.println("Second static-block");
	}
}

public class Test6 
{
	public static void main(String[] args)
	{
		SampleClass sc = new SampleClass();
		sc.show();                //calling non-static method.
		SampleClass.display();    //calling static method.
		sc.display();             //can be called by instance, but should be called in static way. 
	}
}