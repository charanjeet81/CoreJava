package OverridedMethods_8;

//The java instanceof operator is used to test whether the object is an instance of the specified type (class or subclass or interface).
// Note if you will assign the value then only it will become eligible to tell instanceof 
class A
{}

class B extends A
{}


public class Test9 {
	static Integer i; 
	static String s1 = "INDIA";
	static String s2 = new String("INDIA");
	static String s3;
	static String s4 = null;

	public static void main(String[] args) {
	
		System.out.println(s1 instanceof String);
		System.out.println(s2 instanceof String);
		System.out.println(s3 instanceof String);
		System.out.println(s4 instanceof String);
		System.out.println(i instanceof Integer);
		
		A a1 = new B();
		System.out.println(a1 instanceof A);
		System.out.println(a1 instanceof B);
		
		A a2 = new A();
		System.out.println(a2 instanceof A);
		System.out.println(a2 instanceof B);
	}
}
