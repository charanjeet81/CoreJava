//abstracts class is a class with at-least one complete and other incomplete methods(abstract).
//You can extend abstract, can compile abstract class, but can't instantiate an object of abstract class.
//this-keyword cannot be used in a static context means in a static method.

package abstract_interface_11;

abstract class FourWheeler
{
	FourWheeler()
	{
		System.out.println("Constructor.");
	}
	
	final static void wheels()
	{
		// this.wheels();  this cannot be used in a static context.
		System.out.println("It will have four wheels.");	
	}
	
	abstract void gears();
	
	abstract void fuel();	
}

abstract class Car extends FourWheeler    //abstract to abstract
{
	void gears()
	{
		System.out.println("It will have five gears.");	
	}
	
	abstract void carType();	
}

class Santro extends Car                 //Santro will implement abstract Car and FourWheeler.
{
	void gears()     //overridden
	{
		System.out.println("It will have five gears, with fifth reverse one");	
	}
	void fuel()      //implemented.
	{
		System.out.println("It will run on petrol.");	
	}
	void carType()   //implemented.
	{
		System.out.println("It is a hatchback.");	
	}	
}

public class Test
{
	public static void main(String args)
	{
		System.out.println(" main(String args)");
		FourWheeler.wheels();
		Santro s = new Santro();
		s.carType();
		s.fuel();
		s.gears();
		s.wheels();		
	}
	
	public static void main(String[] args)
	{
		System.out.println(" Default main.");
		FourWheeler.wheels();
		Santro s = new Santro();  // Constructor will be invoked here.
		s.carType();
		s.fuel();
		s.gears();
		s.wheels();
		System.out.println(s.hashCode());
	}	
	
	public static void main(int[] args)
	{
		System.out.println(" main(int[] args)");
		
		FourWheeler.wheels();
		Santro s = new Santro();
		s.carType();
		s.fuel();
		s.gears();
		s.wheels();
	}
}







