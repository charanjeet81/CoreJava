package designPattern.creationalDesignPattern;
/*1. Java Singleton Pattern is one of the Gangs of Four Design patterns and comes in the Creational Design Pattern 
category. From the definition, it seems to be a very simple design pattern but when it comes to implementation, 
it comes with a lot of implementation concerns. The implementation of Java Singleton pattern has always been a 
controversial topic among developers.
2. Singleton pattern restricts the instantiation of a class and ensures that only one instance of the class 
exists in the java virtual machine. The singleton class must provide a global access point to get the instance 
of the class. Singleton pattern is used for logging, drivers objects, caching and thread pool.
3. Singleton design pattern is also used in other design patterns like Abstract Factory, Builder, Prototype, 
Facade etc. Singleton design pattern is used in core java classes also, for example java.lang.Runtime, java.awt.Desktop.
4. Way to implement java Singleton Pattern:
-Private constructor to restrict instantiation of the class from other classes.
-Private static variable of the same class that is the only instance of the class.
-Public static method that returns the instance of the class, this is the global access point for outer world to
get the instance of the singleton class.
*/
      
/*In eager initialization, the instance of Singleton Class is created at the time of class loading, this is the 
easiest method to create a singleton class but it has a drawback that instance is created even though client 
application might not be using it.\
This way does not provide the way for the exception handling, like for File handling, DB-Connections.*/
class EagerInitialization
{
	private static final EagerInitialization obj = new EagerInitialization();
	
	private EagerInitialization() { }
	
	void anyMethod()
	{
		System.out.println("Can't use with direct object creation.");
	}
	
	public static EagerInitialization getInstance()
	{
		return obj;
	}
}

public class SDP1_EagerInitialization 
{
	public static void main(String[] args) 
	{
		//EagerInitialization obj = new EagerInitialization(); //can't make object.
		EagerInitialization.getInstance().anyMethod();
	}
}
