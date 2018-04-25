package Constructor_3;

class Sample 
{
	static int b;  // It will take default values in case of instance variable.
	
	Sample()      // non-para constructor, only public, private and protected is permitted, nothing else.
	{
		this(b);
		final int c=3;		
		System.out.println("Non-para costructor with value: "+c);
	}
	
	Sample(int a) // para constructor.
	{
		System.out.println("Para costructor with value: "+a);
	}

	void Sample() 
	{
		final int d; 
		// We can declare any variable without any value, but without using. (But if we are using it must be initialized.) 
		// It will not print default value in case of local variable.
		// Only final is permitted with local variables.
		System.out.println("I am like constructor but not, as having return type.");
	}
}

public class Test2
{
	public static void main(String[] args) 
	{
		Sample s = new Sample();
		s.Sample();
	}
}