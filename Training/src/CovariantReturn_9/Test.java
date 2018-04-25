//in case of overriding return type should be same, but in case of inheritance Sub class can be return type.
package CovariantReturn_9;

class Super
{
	int i=10; 
	Super getInstance()
	{
		return new Super(); // return new Sub();
	}
	private void m1()   //private is limited upto that class.
	{
		System.out.println("Hi this is m1().");
	}
	protected void m2() //but, protected is limited upto inherited class.
	{
		System.out.println("Hi this is m2().");
	}
}
 
class Sub extends Super
{
	Sub getInstance() //in case of overriding return type should be same, but in case of inheritance Sub class can be return type.
	{
		return new Sub();
	}
}

class Subb extends Sub
{

}

public class Test {
	public static void main(String[] args)
	{
		Sub sub = new Subb();
		sub.m2();
	}
}
