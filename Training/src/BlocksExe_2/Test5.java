package BlocksExe_2;

public class Test5 
{
	Test5(int a)
	{
		System.out.println("para");
	}
	
	Test5()
	{
		this(1);
		System.out.println("1");
	}
	
	{
		System.out.println("2");
	}
	
	static
	{ 
		System.out.println("3");
	}	
	
	public static void main(String[] args)
	{
		Test5 t = new Test5();
		System.out.println("4");
	}
	
	{
		System.out.println("5");
	}
	
	static
	{ 
		System.out.println("6");
	}	
}