package Super_6;
class Super
{
	static
	{
		System.out.println("static 1");
	}
	Super()
	{
		this(3);
		System.out.println("non-para Super Constructor.");
	}
	{
		System.out.println("Super init-Block.");
	}
	Super(int a)
	{
		System.out.println("para Super Constructor.");
	}
}

class Sub extends Super
{
	static
	{
		System.out.println("static 2");
	}
	Sub()
	{
		//super();
		this(4);
		System.out.println("non-para Sub Constructor.");
	}
	{
		System.out.println("Sub init-Block.");
	}
	Sub(int a)
	{
		System.out.println("para Sub Constructor.");
	}
}

public class Test4 {
	public static void main(String[] args)
	{
		new Sub();
	}
}

