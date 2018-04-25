package BlocksExe_2;

// Why init-Blocks are not executing?
/*Running Sequence for each class:
	1. All static-blocks
	2. main()
		{
			if(obj creation)
			{
	3. 			init-blocks
	4. 			constructor
			}
		}
	5. variable or methods.*/


public class Test8 
{
	public Test8()
	{
		System.out.println("I am a constructor.");
	}
	
	static
	{ 
		System.out.println("1");
	}	
	
	{
		System.out.println("5");
	}
	
	public static void main(String[] args)
	{
		System.out.println("pre");
		new Test8();
		System.out.println("post");
	}
	
	{
		System.out.println("8");
	}
	
	static
	{ 
		System.out.println("3");
	}	
}