package reflection;

import java.lang.reflect.Field;

//The value of Double.TYPE is identical to that of double.class.
//Void.TYPE is identical to void.class.
//
//Class<?>[] c = Character.class.getClasses();
//Character contains two member classes Character.Subset and Character.UnicodeBlock.
//
//Anonymous Class Declarations will not have a declaring class but will have an enclosing class.
//Class c = Thread.State.class().getEnclosingClass();
//

class Address{}

class SuperStudent
{
	Address ad;
	int rollNum;
	int age;
	
	SuperStudent(int rollNum, int age)
	{
		this.rollNum = rollNum;
		this.age = age;
	}
	
	public void display()
	{
		System.out.println("Roll. No. is: "+rollNum+" and age is: "+age);
	}
}

class SubStudent extends SuperStudent
{
	SubStudent(int r, int a)
	{
		super(r, a);
	}
}


public class Test2 {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException
	{
		SubStudent s1 = new SubStudent(101, 21);
		System.out.println(s1.getClass().getName());
		System.out.println(s1.getClass().getSuperclass().getName());
		
		Field f =  System.class.getField("out");
		Class c = f.getDeclaringClass();
		System.out.println(c.getName());
	}
}
