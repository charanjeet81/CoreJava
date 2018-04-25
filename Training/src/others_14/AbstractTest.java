package others_14;

abstract class Car
{
	int wheels = 4;
	void gears()
	{
		System.out.println("Cars have Five Gears");
	}
	abstract void fuel();  //Give definition according to your type. 
}

class BMW extends Car
{
	void fuel()
	{
		System.out.println("It uses 'Diesle' uses as fuel.");
	}	
}

class Mercedes extends Car
{
	void fuel()
	{
		System.out.println("It uses 'Petrol' uses as fuel.");
	}	
}

public class AbstractTest 
{
	public static void main(String[] args)
	{
		BMW b = new BMW();
		b.gears();
		b.fuel();
		
		Mercedes m = new Mercedes();
		m.gears();
		m.fuel();
	}
}
