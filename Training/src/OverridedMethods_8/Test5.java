//override equals()
package OverridedMethods_8;

class Student
{
	private int rollNo;
	private int marks;	
	Student(int rollNo, int marks)
	{
	this.rollNo=rollNo;
	this.marks=marks;
	}
	public String toString()      //overridden toString, otherwise it return package.className@hashCode    
	{
		return "Roll Number: "+rollNo+" marks: "+marks; 
	}
	public int hashCode()         //overridden hashCode, otherwise it returns unique hashCode for diff obbjs
	{
		return marks*10;
	}
	public boolean equals(Object ob)    //overrided equals, otherwise it checks reference.
	{
		Student a = (Student)ob;
		if(rollNo==a.rollNo&&marks==a.marks)
			return true;
		else 
			return false;
	}
}

public class Test5 {
	public static void main(String[] args)
	{
		Student s1 = new Student(101, 54);
		Student s2 = new Student(101, 54);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1.equals(s2));
		Student s3 = s2;
		System.out.println(s3.equals(s2));
		System.out.println(s2);     //	System.out.println(s2.toString());     
		
	}
}
