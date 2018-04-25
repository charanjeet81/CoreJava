package equals_10;


/*
1. When you really need to know if two references/addresses are identical, use ==. But when
you need to know if the objects themselves/values (not the references) are equal, use the equals() method (as in case of String).
2. if you don't override a class's equals() method, you won't be able to use those objects as a key in a hashtable.
3. The equals() method in class Object uses only the == operator for comparisons, so unless you override equals(), 
two objects are considered equal only if the two references refer to the same object.
4. Fortunately, the String and wrapper classes work well as keys in hashtables they override the equals() method. 
So rather than using the actual car instance as the key into the car/owner pair, you could simply use a String that
represents the unique identifier for the car.
5. Hashcodes are typically used to increase the performance of large collections of data.
6. Although you can think of it as kind of an object ID number, it isn't necessarily unique. Collections such as HashMap and
HashSet use the hashcode value of an object to determine how the object should be stored in the collection, and the hashcode is used again to help locate the object
in the collection.
7. If want to compare two objects based upon the equals() method. Although in a very simple class like Student, 
you can achieve without overriding hashCode() method. But if you do this , you are going to violate the contract for the 
methods hashCode() and equals() of the object class. The similar case is for the method equals().
8. if two objects are equal, that is obj1.equals(obj2) is true then, obj1.hashCode() and obj2.hashCode() must return same integer, vice versa is not correct.
9. .equals() is used for checking Object equality(On the basis of your implementation values.)
10. To honor the above contract we should always override hashCode() method whenever we override equals() method.
 If not, what will happen? If we use hashtables in our application, it will not behave as expected. 
 As the hashCode is used in determining the equality of values stored, it will not return the right corresponding value for a key.
11. Default implementation given is hashCode() method in Object class uses the internal address of the object 
and converts it into integer and returns it. This is the lowest form of equality implementation and provides 
guaranteed results for hastables implementation. When we override equals() and change the meaning of equality 
for an object then the same should be reflected by overriding the hashCode method. */

/*public boolean equals(Object obj)    Actual equals implementation.
{
	return (this == obj);
}*/

class Student
{
	private int rollNo;
	private String name;
	
	Student(int rollNo, String name)
	{
		this.rollNo=rollNo;
		this.name=name;
	}
	
	public String toString()      //overridden toString, otherwise it return package.className@hashCode    
	{
		return "Roll Number: "+rollNo+" name: "+name; 
	}
	public int hashCode()         //overridden hashCode, otherwise it returns unique hashCode for diff objs.
	{
		return rollNo*10;
	}
	public boolean equals(Object ob)    //overrided equals(Checking objects on the basis of Object values), otherwise it checks reference.
	{
		Student a = (Student)ob;
		if(rollNo==a.rollNo && name.equals(a.name))  
			return true;
		else 
			return false;
	}
}

public class Test 
{
	public static void main(String[] args)
	{
		Student s1 = new Student(101, "Amit");
		Student s2 = new Student(101, "Amit");
		System.out.println("Overrided Hashcode: "+s1.hashCode());
		System.out.println("Overrided Hashcode: "+s2.hashCode());
		System.out.println("Actual Hashcode: "+System.identityHashCode(s1));
		System.out.println("Actual Hashcode: "+System.identityHashCode(s2));
		System.out.println(s1.equals(s2)); // If you are not overriding equlas(), it will remain as same as ==.
		System.out.println(s1==s2);        // It will check the reference.
		Student s3 = s2;
		System.out.println(s3.equals(s2));
		System.out.println(s2);     //	System.out.println(s2.toString());     		
	}
}