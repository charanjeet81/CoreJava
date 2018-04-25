//In case of inheritance,for same "static methods" and "variables", they are called in same way(according to their reference) 
//i.e. no dynamic polymorphism for these two whereas non-static methods are called according to its constructor type.
//*Runtime polymorphism or dynamic polymorphism is achieved in case of overridded methods i.e. which method is to be
//called is resolved at run time.
//*Binding is to connect method call and its definition. 1. Static Binding  2. Dynamic Binding
//*Object Upcasting: when super class refers to sub class.
//*Object Downcasting: when sub class refers to super class.
package Redefining_10;

class Super
{
	int i = 3;
	void show()
	{
		System.out.println("I am show in Super.");
	}
	static void display()
	{
		System.out.println("I am display in Super.");
	}
}
class Sub extends Super
{
	int i = 4;
	void show()
	{
		System.out.println("I am show in Sub.");
	}
	static void display()         //redefining for static methods.
	{
		System.out.println("I am display in Sub.");
	}
}

public class Test1 {
	public static void main(String[] args)
	{
		Super s1 = new Super();
		s1.show();
		System.out.println(s1.i);
		s1.display();
		
		Super s2 = new Sub();
		s2.show();
		System.out.println(s2.i);
		s2.display();
		
		Sub s3 = new Sub();
		s3.show();
		System.out.println(s3.i);
		s3.display();
	}
}
