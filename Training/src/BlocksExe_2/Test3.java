package BlocksExe_2;

class Sample
{
	static
	{
		System.out.println("First Static Block.");	
	}
	
	Sample()
	{
		System.out.println("Hello this is non-para costructor, but not a default constructor.");	
	}
	
	{
		System.out.println("init-block.");
	}
	
	void Sample()
	{
		System.out.println("I am like constructoe but not, as having return type.");	
	}
	
	static
	{
		System.out.println("Second Static Block.");	
	}	
}
	
public class Test3
{
	public static void main(String[] args)
	{
		Sample s = new Sample();
		s.Sample();
	}
}