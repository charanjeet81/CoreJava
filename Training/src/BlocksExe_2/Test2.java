package BlocksExe_2;

// Why Init-Blocks are not executing?
// Because no constructor call in main-method, if there will be constructor call in main all the init-blocks will execute.



public class Test2 
{
	static
	{ 
		System.out.println("1");
	}	
	
	{
		System.out.println("2");
	}
	
	public static void main(String[] args)
	{
		System.out.println("3");
	}
	
	{
		System.out.println("4");
	}
	
	static
	{ 
		System.out.println("5");
	}	
}