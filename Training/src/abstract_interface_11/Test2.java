package abstract_interface_11;

interface P
{
	int a = 10;
	void show();	
}

interface Q
{
	int a = 15;
	void show();	
}

interface R extends P,Q
{}

class S implements R
{
	public void show()
	{
		System.out.println("I am show.");
	}
}

public class Test2 {
	public static void main(String[] args)
	{
		S s = new S();
		s.show();
		System.out.println(P.a);      
		System.out.println(Q.a); 
		// System.out.println(R.a);    //ambiguous.
		// System.out.println(S.a);    //ambiguous.
	}

}
