//toString()-overridden 
package OverridedMethods_8;

class Student1
{
	private String name;
	private String email;
	private Integer age;
	
	Student1(String name, String email, Integer age)
	{
		this.name=name;
		this.email=email;
		this.age=age;
	}
	
	public String toString()   //overridden toString()
	{
		return "Name is: "+name+" and email is: "+email+" and age is: "+age;
	}
}

public class Test2 {
	public static void main(String[] args)
	{
		Student1 s = new Student1("Tom","tom@gmail.com",21);
		System.out.println(s);   
		System.out.println(s.toString()); 
		//internally it is s.toString(), if toString() is not overrided then it will return ClassName@HexadecimalOfObj
	}
}
