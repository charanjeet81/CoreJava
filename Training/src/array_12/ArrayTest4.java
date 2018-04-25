package array_12;

class Animal
{ 
	int legs;
	void fxn()
	{
		System.out.println("Four Legs");
	}	
}

public class ArrayTest4 
{
	public static void main(String[] args) 
	{
		Animal[] ani = new Animal[3];//object is not created, only reference is created which is not referring to any object i.e. NULL 
		System.out.println(ani[0]);
		//System.out.println(ani[0].toString());  //NullPointerException
		
		ani[1] = new Animal();
		System.out.println(ani[1].toString());
	}
}
