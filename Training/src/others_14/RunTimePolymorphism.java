package others_14;

// Variables and static-methods are called based on reference type whereas normal-methods are called based on its object type.

class SuperClass
{
	int a = 3;
	void Fxn()
	{
		System.out.println("In Super Class.");
	}	
	static void method()
	{
		System.out.println("Method in Super Class.");
	}	
}
class SubClass extends SuperClass
{
	int a = 4;
	void Fxn()
	{
		System.out.println("In Sub Class.");
	}
	static void method()
	{
		System.out.println("Method in Sub Class.");
	}
}

public class RunTimePolymorphism 
{
	public static void main(String[] args) 
	{
		SuperClass sup = new SuperClass();
		System.out.println(sup.a);
		sup.Fxn();
		sup.method();
		
		SubClass sub = new SubClass();
		System.out.println(sub.a);
		sub.Fxn();
		sub.method();
		
		SuperClass s = new SubClass();
		System.out.println(s.a);
		s.Fxn();
		s.method();
	}

}
