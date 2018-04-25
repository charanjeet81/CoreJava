//Constructor Overloading and use of this() and super() call.
package Super_6;

/*class A
{
	A()
	{
		System.out.println("non-parameterised constructor, called by implicit super() call");
	}
}
class B extends A
{
	B()
	{
	 //super();	 //non-parameterised implicit super() call.
	}	
}
public class Test3 {
	public static void main(String[] args)
	{
		B b = new B();
	}
}*/

//___________________________________________________________________________

//Use of this
/*class A
{
	A()
	{
		this("Hi!!!");
		System.out.println("non-parameterised constructor, called by implicit super() call");
	}
	A(String s)
	{
		System.out.println(s+"parameterised super call");
	}
}
class B extends A
{
	B()
	{
		//super();	 //non-parameterised implicit super() call.
		this(5);	
	}
	B(int a)
	{
		this(3,4);
		System.out.println("B(int a) constructor.");
	}
	B(int b,int c)
	{
		System.out.println("B(int b, int c) constructor.");
	}
}
public class Test3 {
	public static void main(String[] args)
	{
		B b = new B();
	}
}*/

//_____________________________________________________________________________
//If only parameterised constructor is give in Super class, then you must explicit give parameterised  super call
//from Sub class. 

class A
{
	A(String s)
	{
		System.out.println(s+"parameterised super constructor.");
	}
}
class B extends A
{
	B()
	{
		super("Hi !!!"); 	  //explicite parameterised super call.
		System.out.println("non-parameterised sub constructor.");
	}
}
public class Test3 
{
	public static void main(String[] args)
	{
		B b = new B();
	}
}


//---------------------------------------------------------


/*
class A
{
	A()
	{
		System.out.println("parameterised super call");
	}
	A(String s, int b)
	{
		System.out.println(s+"parameterised super call");
	}
}
class B extends A
{
	B()
	{
		this(2, 5);	
	}
	B(int a, int b)
	{
		//super();
		//super("Hello !!!", 7);         //explicite parameterised super call should be done from either of the Sub class constructor.
		System.out.println("B(int a) constructor.");
	}
}
public class Test3 {
	public static void main(String[] args)
	{
		new B();
	}
}*/

