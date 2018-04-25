//Use of super and this keyword:
//super keyword is used to refer immediate parent class' instance variable.
//super keyword is used to refer immediate parent class' instance method.
//super() call is used to refer immediate parent class' constructor.
//super() or this() call should be done from the very first line of any constructor.
//There can be only one call(either of this() or super()) at a time from a particular constructor.

package Super_6;


/*class Super
{
	int a = 4;
    void show()
	{
		System.out.println("Show in Super class.");
	}	
}
class Sub extends Super
{
	int a = 5;
	int k = super.a;    // for calling Super class' variable.
	void show()         // overrided method.
	{
		System.out.println("Show in Sub class.");
	}
	void display()      // for calling Super class' method.
	{
		super.show();   // super keyword is used.
	}
}

public class Test2 {
	public static void main(String[] args)
	{
		Sub s = new Sub();
		System.out.println("Super's variable:"+s.k);
		s.display();    // to call Super class' method.
		s.show();       // It will call Sub class' overrided method.
	}
}*/