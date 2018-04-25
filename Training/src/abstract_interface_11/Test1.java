//interface is used to achieve the "full-abstraction" and "multiple-inheritance".
//By default its methods are "public abstract".
//By default its variable are "public static final".
//You can't instantiate object of interface.
//Serializable, Remote, Cloneable etc are marker-interface/Blank interface which do not have any method declaration,
//whereas used as rule implementation by JVM.  


package abstract_interface_11;

interface A
{
	int a = 4;            // public static final int a = 4;    e.g. like constant PI = 3.14;
	
	void show();          // public abstract void show();	
	void display();	      // public abstract void display();	
	void print();	      // public abstract void print();
}

class B implements A
{
	public void show()
	{
		System.out.println("I am show.");
	}
	public void display()
	{
		System.out.println("I am display.");
	}
	public void print()
	{ }                 //Null implementation if functionality of method is not known.
}

public class Test1 {
	public static void main(String[] args)
	{
		B b = new B();
		b.show();
		b.print();
		b.display();
		System.out.println(A.a);            
		System.out.println("a="+(B.a+10));
	}

}
