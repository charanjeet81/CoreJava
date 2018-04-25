package innerClass_14;


//Plain-Old Anonymous Inner class, flavor Two : It creates an anonymous implementer of the specified interface.

interface Cookable
{
	void cook();
}
class Foood
{
 static Cookable ck = new Cookable(){      //static anonymous
	public void cook()                     //implementing cook()
	{		
		System.out.println("Implemented Cook");
	}
 };	
}

public class AnonymousTest2
{
	public static void main(String[] args)
	{
		Foood f = new Foood();
		f.ck.cook();
		
		Foood.ck.cook();                  //static member can be direct invoke be class name.
		
	}
}














