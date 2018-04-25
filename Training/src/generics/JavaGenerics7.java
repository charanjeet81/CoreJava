package generics;

import java.util.ArrayList;

// Bounded Type; We can bound the type for a particular range like: for its sub class. 
// Type parameterization can be defined at either at class level or at method level.


class A { }

class B extends A { }

class C extends B { }

class D extends C { }


class GenericMethodTest
{
	public void m1(ArrayList<String> l) { }
	
	public void m2(ArrayList<Integer> l) { }
	
	public void m3(ArrayList<?> l) { }
	
	public void m4(ArrayList<? extends A> l) { }
	
	public void m5(ArrayList<? super D> l) { }
}

class JavaGenerics7 
{
	public static void main(String args[])
	{
		
	}
}