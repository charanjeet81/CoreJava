// variable declaration can be anywhere, but if you are making use of them you should declare first then use it.

public class Student
{
	String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	int age;
}
