//final variable can't be changed.
//final methods can't be overrided.
//final class can't be inherited.


package Final_10;

class Super
{
	final int i=4;       //final variable, can't changed.
	int change()
	{
		// i=6;           //you can't change final variable, it will generate error.
		return i;
	}
	final void show()    //final method, can't override.
	{
		System.out.println("I am Hi !!!");
	}
}

/*final class Sub1 extends Super   //final class, can't inherited.
{
	void show()          //you can't override final methods, it will generate error.
	{
		System.out.println("I am Hello !!!");
	}
}
class Sub2 extends Sub1  //Sub2 can't be Sub-class of Sub1(can not inherit), because Sub1 is final.
{}

public class Test1 
{
	public static void main()
	{
		
	}
}*/
