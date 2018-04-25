//Block Execution
/*
1. All static blocks execute at the time of class loading.
2. Only static block is not supported by java now, main method should be there along with.
3. Running Sequence: All static blocks -> all init blocks -> main method -> constructor ->variables */

package BlocksExe_2;

class A
{
	String a = "A Class";
	
	A()
	{
		System.out.println("1");
	}
	
	void fxn1()
	{
		System.out.println("2");
	}
	
	static
	{
		System.out.println("3");
	}
	
	{
		System.out.println("4");
	}
	
	static
	{
		System.out.println("5");
	}
	
	{
		System.out.println("6");
	}
	
}

class B
{
	String a = "B Class";
	
	B()
	{
		System.out.println("7");
	}
	
	void fxn1()
	{
		System.out.println("8");
	}
	
	static
	{
		System.out.println("9");
	}
	
	{
		System.out.println("10");
	}
	
	static
	{
		System.out.println("11");
	}
	
	{
		System.out.println("12");
	}
}

public class Test7 
{
	static 
	{
		System.out.println("main-class-static-block-1");
	}
	
	public static void main(String[] args) 
	{
		A oA = new A();
		System.out.println(oA.a);
		oA.fxn1();
		
		B oB = new B();
		System.out.println(oB.a);
		oB.fxn1();
	}
	
	{
		System.out.println("main-class-init");
	}
	
	Test7()
	{
		System.out.println("Main class constructor.");
	}
	
	static 
	{
		System.out.println("main-class-static-block-2");
	}
}

/*Output
 * 
main-class-static-block-1
main-class-static-block-2
3
5
4
6
1
A Class
2
9
11
10
12
7
B Class
8
*/
