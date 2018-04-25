package operators_14;

interface I{}
class A implements I{}
class B extends A{}

public class Test2 
{
	public static void main(String[] args) 
	{
		String s1 = new String("amazing");
		System.out.println(s1 instanceof String);     // true
		
		//instanceof does not checks reference-of
		String s2 = null;     //"null" and any reference referring to it do not passes "instanceof" test.
		System.out.println(s2 instanceof String);     // false
		System.out.println(null instanceof String);   // false
		
		B b = new B();
		System.out.println(b instanceof B);  // true
		System.out.println(b instanceof A);  // true
		System.out.println(b instanceof I);  // true
		
		//array-object is "instanceof" Object class.

	}

}
