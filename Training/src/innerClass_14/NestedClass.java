package innerClass_14;

class MyOuter{
	static class Nest  //Nested class is type of inner class, which make use of "static" keyword.
	{
		void nested()
		{
			System.out.println("I'm nested method.");
		}
	}
}

public class NestedClass 
{
	public static void main(String[] args) 
	{
		MyOuter.Nest mon = new MyOuter.Nest();
		mon.nested();
	}
}
