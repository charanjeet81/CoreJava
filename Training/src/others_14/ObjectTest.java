package others_14;


class A
{
	 B b_obj = new B();
	void a_fxn()
	{
		System.out.println("from A");
	}	
}
class B
{
	 C c_obj = new C();
	void b_fxn()
	{
		System.out.println("from B");
	}
}
class C
{
	void c_fxn()
	{
		System.out.println("from C");
	}
}

public class ObjectTest 
{	
	public static void main(String[] args) 
	{
		A a_obj = new A();
		a_obj.a_fxn();
		a_obj.b_obj.b_fxn();
		//A.b_obj.c_obj.c_fxn();
		a_obj.b_obj.c_obj.c_fxn();
	}
}
