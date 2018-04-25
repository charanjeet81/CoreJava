//In case of inheritance, methods get inherited and you can override inherited method.
//variable don't get inherited, they remains separate for separate class. 
//variables will be printed according to the reference type, but in case of methods overrided will work. 

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
	void show()
	{
		System.out.println("Show in Sub class.");
	}
}

public class Test1 
{
	public static void main(String[] args)
	{
		Super s1 = new Super();
		s1.show();               //Show in Super class.
		Sub s2 = new Sub();     
		s2.show();               //Show in Sub class.
		Super s3 = new Sub();   
		s3.show();               //Show in Sub class.
		//Sub s2 = new Super();  //can't refer Super class property through Sub class' reference.
		
		System.out.println(s1.a);  // 4
		System.out.println(s2.a);  // 5
		System.out.println(s3.a);  // 4
	}
}*/
