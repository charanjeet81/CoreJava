package OverridedMethods_8;

//:::::::::::::: B I N D I N G :::::::::::::://
//Connecting a method call to the method body is known as binding.
//There are two types of binding
//1. static binding (also known as early binding).
//2. dynamic binding (also known as late binding).
//When type of the object is determined at compiled time(by compiler), it is known as static binding.
//If there is any private, final or static method in a class, there is static binding.
//When type of the object is determined at run-time(by JVM), it is known as dynamic binding.

class Animal {
	void eat() {
		System.out.println("animal is eating...");
	}
}

class Dog extends Animal {
	void eat() {
		System.out.println("dog is eating...");
	}

}

public class Test8 
{
/*	public void check(Animal a)
	{
		System.out.println("Animal");
		System.out.println("Checking Animal");
	}
	
	public void check(Dog d)
	{
		System.out.println("Dog");
		System.out.println("Checking Dog");
	}*/
	
	public void check(Object o)
	{
		System.out.println("Object");
		System.out.println("Checking "+o.getClass().getName());
	}
	
	public static void main(String args[]) 
	{
		Test8 t = new Test8();
		
		Animal x = new Dog();
		
		Dog d = new Dog();
		
		Animal a = new Animal();
		
		//DYNAMIC BINDING
		x.eat();   //In this case decision of calling eat() is happening at run-time.
		//At compile-time 'a' is like Animal but at run-time 'a' is like Dog.
		//Because of runtime-polymorphism, it will call eat() of Dog(overridden eat()).

		//STATIC BINDING
		//At time of sending value in methods, it will be consider as a reference-type.
		t.check(x); //But again here 'x' starts behaving like Animal, because calling check(x) is happening at compile-time.	
		
		System.out.println(x instanceof Dog);
		System.out.println(x instanceof Animal);
		
		t.check(a);
		t.check(d);
		
	}
}
