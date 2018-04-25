//Method Overloading----->>
//either "number of parameters" or "type of parameters" should be different.
//return type doesn't matter.
//name of the methods should be same.
package MOL_4;

/*public class Test1
{
	static void sum(int a, int b)
	{
		System.out.println("It will add two integers like: "+(a+b));
	}
	static void sum(int a, int b, int c)
	{
		System.out.println("It will add three integers like: "+(a+b+c));
	}
	static void sum(int a, int... b)
	{
		int s=0;
		for (int i : b)   //For-each loop.
		{
			s = s + i;			
		}
		System.out.println("Sum of numbers is: "+s);
	}
	static void sum(float a, float b)
	{
		System.out.println("It will add two floats like: "+(a+b));
	}
	
	public static void main(String[] args)
	{
		sum(2,3);          //  It will add two integers.
		sum(2.3f, 3.1f);   //  It will add two floats, but not sum(2.3, 3.1) because it directly goes to "double"
		sum(3,5,7);
		sum(3, 4, 5, 6, 7, 8, 9);
	}
}*/


public class Test1 
{	
	static int sum(int a, int b)
	{
		System.out.println("called int-int");
		return a+b;
	}
	static void sum(float a, float b)
	{
		System.out.println("called float-float");
	}
	static void sum(float a, double b)
	{
		System.out.println("called float-double");
	}
	static void sum(long a, long b)
	{
		System.out.println("called long-long");
	}
	public static void main(String[] args)
	{
		sum(2, 3);         // called int-int
		sum(2l, 3l);         // called long-long		
		sum(2, 3l);        // called long-long
		sum(2.3f, 3.1d);   // called float-float , ?
		sum(2.3f, 3.1);   // called float-double, but sum(2.3,3.1L) will show error.
	}
}
