package Final_10;
//Blank final variable, are those final variables which are final and do not have any initial value.
//and there are only two possibility to assign value, i.e. init-block and constructor, but you can use only one at a time.

class Sample
{
	final int a;     //Blank-Final-Variable
	
	{
		a=3;
	}
	
	
/*	Sample()         //use either way to assign value in final-block variable.
	{
		a=5;
	}*/
}
public class Test2 {	
	public static void main(String[] args)
	{
		Sample s = new Sample();
		System.out.println("a: "+s.a);		
	}
}
