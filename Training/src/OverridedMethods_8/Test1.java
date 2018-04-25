package OverridedMethods_8;

class Super
{ 
	int a = 4;  // Will be inherited to all class.
	int b = 5;
	static void display()
	{
		System.out.println("Display");
	}	
}
class Sub1 extends Super
{
	int b = 6;
	static void display()
	{
		System.out.println("Display Sub-1");
	}	
}
class Sub2 extends Super
{
	int b = 7;
	static void display()
	{
		System.out.println("Display Sub-2");
	}	
}
public class Test1 {
	public static void main(String[] args)
	{
		Super[] arr = new Super[2];
		arr[0]=new Sub1();
		arr[1]=new Sub2();
		for(Super s:arr)
		{
			s.display();
		}
		System.out.println("============");
		Super a1 = new Sub1();
		a1.display();
		System.out.println(a1.b);
		System.out.println("============");
		
		Sub1 a2 = new Sub1();
		a2.display();
		System.out.println(a2.b);
		
		Sub2 a3 = new Sub2();
		a3.display();
		System.out.println(a3.b);
	}
}






