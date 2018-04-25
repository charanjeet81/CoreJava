package innerClass_14;

public class OuterClass 
{                             
	private static String x = "from outer";
	public static void main(String[] args)   //method
	{
		final String y = "local variable";
		class MyInner                        //"Method-Local Inner Class" : class which is local to any method.)
		{									 //Inner class can only "final" or "abstract"
			void seeOuter()
			{
				System.out.println(x);
				System.out.println(y);       //Can't access "local variable", unless it is "final"
			}
		}
		MyInner in = new MyInner();
		in.seeOuter();
	}

}
