package others_14;

class Top
{
	void m()
	{
		System.out.println("I am in Top");
	}
}
interface I1
{
	void m();	
}
interface I2
{
	void m();	
}

public class MultipleInheritance extends Top implements I1,I2 
{
	public void m()
	{
		System.out.println("I am of I1 or I2 ???");
	}
	
	public static void main(String[] args) 
	{
		MultipleInheritance obj = new MultipleInheritance(); //same class object can be created in its own class as well.
		obj.m();
		
		Top obj1 = new Top();
		obj1.m();
		
		I1 obj2 = new MultipleInheritance();  //Runtime Polymorphism.
		obj2.m();
		
		I2 obj3 = new MultipleInheritance();
		obj3.m();
	}
}
