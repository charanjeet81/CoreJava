//Inheritance and MOR
//Inheritance is the concept in which one object/class acquire the properties and behaviour of parent object/class. 
//Inheritance represented IS-A relationship.
//It helps in code reusablity and save developing time.
//It support runtime-polymorphism (method-overriding).
/*syntax:
	class BMW extends Car  // extend keyword is used, BMW IS-A Car
	{
	
	}*/

package INHERITANCE_5;

class Employee
{
	int salary = 10000;
	int bonous = 0;
	public void getSalary()
	{
		System.out.println("Employee's Salary :"+salary);
	}	
}

class Programmer extends Employee
{
	int bonous = 5000;
	public void getSalary()      //Method Overriding
	{
		System.out.println("Programmer's Salary :"+(salary+bonous));
	}	
}

class Tester extends Employee
{
	int bonous = 3000;
	public void getSalary()      //Method Overriding
	{
		System.out.println("Tester's Salary :"+(salary+bonous));
	}	
}

public class Test1
{
	public static void main(String[] args)
	{
		Programmer p1 = new Programmer();  //sub-class reference and sub-class constructor.
		p1.getSalary();
		System.out.println("Bonous is: "+p1.bonous);
		
		Employee e1 = new Employee();      //super-class reference and super-class constructor.
		e1.getSalary();
		System.out.println("Bonous is: "+e1.bonous);
		
		Employee e2 = new Programmer();    //super-class reference and sub-class constructor.
	    e2.getSalary();    // Super class' reference variable will call the overrided method. 
	    System.out.println("Bonous is: "+e1.bonous);
		
	    //Programmer p2 = new Employee();  //Sub class can't reference to Super/Base class.
	    
	    //Tester t = Tester(new Programmer());
	}
}







