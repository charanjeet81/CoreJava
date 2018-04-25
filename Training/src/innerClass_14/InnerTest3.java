package innerClass_14;

interface A
{
	void display();
	
	interface B
	{
		void show();
	}
}

class C implements A, A.B
{
	public void display()
	{
		System.out.println("Hey I am display() from outer-A");
	}
	public void show()
	{
		System.out.println("Hey I am show() from inner-B");
	}
}

public class InnerTest3 
{
	public static void main(String[] args) 
	{
		C c1 = new C();
		c1.display();
		c1.show();
		
		A.B c2 = new C();
		// c2.display();    Can't call display(), because it belongs to outer class.
		c2.show();	
	}
}
