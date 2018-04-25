package INHERITANCE_5;

class C1
{
	C1(int a)
	{
		System.out.println("C1 in Super Class parameterised.");
	}
	public void show()
	{
		System.out.println("Show");
	}
}

class C2 extends C1
{
	C2()
	{
		super(10);             //    explicit super call
		System.out.println("C2 in Sub Class.");
	}
}
public class Test3 {
	public static void main(String[] args)
	{
		C2 ob = new C2(); 
		ob.show();
	}
}