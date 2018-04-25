package INHERITANCE_5;

class Super
{
	static
	{
		System.out.println("Super's static");
	}
	{
		System.out.println("Super init block");
	}
	Super()
	{
		System.out.println("Super constructor.");
	}
}
class Sub extends Super
{
	static
	{
		System.out.println("Sub's static");
	}
	{
		System.out.println("Sub init block");
	}
	Sub()
	{
		System.out.println("Sub constructor.");
	}
}

public class Test4 {
	public static void main(String[] args)
	{
		Sub sub = new Sub();     //important result
		//Super sup = new Super();
		//Super sup = new Sub();
	}
}
