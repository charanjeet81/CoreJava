package others_14;
//you can overload any method by passing different objects as arguments.

class Animal
{}
class Horse extends Animal
{}
class MOL
{
/*	public void running(Animal a)
	{
		System.out.println("Animal is running.");
	}
	public void running(Horse h)
	{
		System.out.println("Horse is running.");
	}*/
	public void running(Object obj)
	{
		System.out.println(obj.getClass().getSimpleName()+" is running.");
	}
}

public class PassingObject 
{
	public static void main(String[] args) 
	{
		MOL m = new MOL();
		m.running(new Animal());  //Passing Animal's Object.
		m.running(new Horse());   //Passing Horse's Object.
	}

}
