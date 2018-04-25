package Final_10;
//"Blank static final variables" are those variables which are final and static and do not have any initial value.
//but there is only one possibility to assign value, i.e. static block.
class Samplee
{
	final static int a;
	
	static
	{
		a=6;
	}
	
	/*Samplee()
	{
		a=7;
	}*/
}
public class Test3 
{	
	public static void main(String[] args)
	{
		Samplee s = new Samplee();
		System.out.println("a: "+s.a);		
	}
}
