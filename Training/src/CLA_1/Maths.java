package CLA_1;

public class Maths 
{
	private Maths()  //If constructor is private one can't create object for that class.
	{}
	static public int sum(int a, int b) // if you won't use public it will not visible there.
	{
	int s = a+b;
	System.out.println("Sum is: "+s);
		return s;
	}
	
	static public int sub(int a, int b)
	{
		int s=0;
		if(a>b)
		{
			System.out.println("Sub is : "+s);
			s = a-b;
		}
		else 
		{
			System.out.println("Negative outpiut won't be shown.");
		}
		return s;			
	}
	
	static public int pro(int a, int b)
	{		
		int s = a*b;
		System.out.println("Prod is: "+s);
		return s;			
	}
	
	static public void div(int a, int b)
	{
		
		try 
		{
			System.out.println("Division is : "+a/b);			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}				
	}
}
