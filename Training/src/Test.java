// Line: 180?

// Execution starts where we have put public-class and public-class should have main() and name of file should be as same of public-class' name.
// We can have multiple main in same class and in different class(MOL) also. 

/*class Hello {
	public static void main(String[] args) {
		System.out.println("hello's main");
	}
}

class Hi {
	public static void main(String[] args) {
		System.out.println("hi's main");
	}
	
	public static void main(int a) {
		System.out.println("hi's main");
	}
}

public class Test {
	public static void main(String[] args) {
		System.out.println("Testing main");
		Hi hi = new Hi();
		hi.main(args);
		hi.main(9);

		Hello hello = new Hello();
		hello.main(args);
	}
}*/

//==================================================================================>

/*class Test
{
	int a = 10;
	{
		System.out.println(a);   // 'a' should be defined before.
		show();                  // method may be anywhere.
	}
	
	static
	{
		System.out.println("Static-Block.");
	}
	
	static void show()
	{
		System.out.println("static calling from non-static.");
	}

	public static void main(String[] args)
	{
		new Test();	
	}
	
	Test()
	{
		System.out.println("Constructor.");
	}
}*/

//==================================================================================>

/*class Test
{
	static int a = 10;
	
	static
	{
		System.out.println(a);
		show();
	}

	public static void main(String[] args)
    {
		new Test();	
    }
	
	static void show()
	{
		System.out.println("I am a 'static' show method.");
	}
}
*/
//==================================================================================>

/*public class Test
{
	int a = 10;  // It will through error, because no static.
	public static void main(String[] args)
	{
		System.out.println("Value of i = "+a);
	}
}*/

// ==================================================================================>

// "static import" feature of java-5 facilitate the java programmer to access any static member of a class directly.
// There is no need to qualify it by class name.
// Difference between "import" and "static import".
// When you do simple import then classes, interface, Exceptions etc. get imported whereas in case of static import
// only static members of a particular class get imported and you need not to call it with class name.

/*import static java.lang.System.*;

public class Test
{
	// It will ping all errors first, no matter whatever the order is.
	public static void main(String[] args)
	{
		out.println("Hello");
		err.println("Error-1");
		out.println("Hello");
		err.println("Error-2");
	}
}
*/
// ==================================================================================>

/*class Super
{
	protected int a=3;    //protected members are inheritable, whereas private are not.
	void show()
	{
		System.out.println("a: "+a);		
	};	
};

class Sub extends Super
{
	int a=5; // variables too are inherited, but do not override it, but overwrite it for that particular class.
	void show()
	{
		System.out.println("Aa: "+a);		
	}		
};

class Test
{
	public static void main(String[] args)
	{
		Super s = new Super();
		s.show();
		System.out.println("a: "+s.a);
		
		Sub sb = new Sub();
		sb.show();
		System.out.println("a: "+sb.a);
		
		// Methods will be considered of sub-class whereas variables will be consider of super-class.
		Super sp = new Sub();
		sp.show();
		System.out.println("a: "+sp.a);
		
		// Sub sub = new Super(); // This is not possible.
	}
}*/

// ==================================================================================>

/*class Hello {
	public static void main(String[] args) {
		System.out.println("Hello main().");
	}
}

class Hi {
	public static void main(String[] args) {
		System.out.println("Hi main().");
	}
}

public class Test {
	public static void main(String[] args) {
		System.out.println("Test main().");
		Hello h1 = new Hello();
		// h1.main("charanjeet", "Singh");  //Why are we not able to call?
	}
}*/











































