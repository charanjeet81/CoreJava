package Final_10;
class Student
{
	final int rollNo;
	final int marks;	
	Student(final int rollNo, final int marks)   //final parameters.
	{
		this.rollNo=rollNo;
		this.marks=marks;
	}
	
	public String toString()                     //overridden toString.    
	{
		return "Roll Number: "+rollNo+" marks: "+marks; 
	}
}

public class Test4 {
	public static void main(String[] args)
	{
		final Student s1 = new Student(101, 67);   //final reference variable.
	    System.out.println(s1);
	    
	    final Student s2;                          //final reference variable.
	    s2 = new Student(102, 33);
	    System.out.println(s1);
	}
}
