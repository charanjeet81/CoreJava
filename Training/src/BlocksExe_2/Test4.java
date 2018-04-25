package BlocksExe_2;

public class Test4 
{
    Test4()
	{
		System.out.println("1");
	}
	
    {
		System.out.println("2 Init Block.");
	}
	
    static
	{ 
		System.out.println("3");
	}	
	
    public static void main(String[] args)
	{
		//Test4 t = new Test4();  // check the output with both the cases.
    	Test4 t = new Test4();
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