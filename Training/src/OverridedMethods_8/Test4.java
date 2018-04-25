//HashCode overridden
package OverridedMethods_8;

/*class Student
{
	private String name;
	private String email;
	private int age;
	Student(String name, String email, Integer age)
	{
		this.name=name;
		this.email=email;
		this.age=age;
	}
	public int hashCode() //override hashcode according to your requirements, it will show the same hashcode for same age group, no unique id will be provided.
	{
		return age*100;
	}
}

public class Test4 {
	public static void main(String[] args)
	{
		Student s1 = new Student("Tom","tom@gmail.com",21);
		Student s2 = new Student("Tom","tom@gmail.com",21);
		Student s3 = new Student("John","john@gmail.com",23);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		
		Student s4 = s1;  //referencing to existing object s1, so it will show same hashCode.
		System.out.println(s4.hashCode());
	}
}*/