package others_14;

class Super
{
	void supMethod(Super sup)
	{
		System.out.println("Super Method");
	}
	
}
class Sub1 extends Super
{}
class Sub2 extends Sub1
{}


public class ObjTest
{

	public static void main(String[] args) 
	{
		Super s = new Super();
		s.supMethod(new Sub1());   // super class can be called by its sub class reference.
		s.supMethod(new Sub2());

	}

}
