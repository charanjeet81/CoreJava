package others_14;
//1. The java.lang.Cloneable interface must be implemented by the class whose object clone we want to create. 
//If we don't implement Cloneable interface, clone() method generates CloneNotSupportedException.
//2. The clone() method saves the extra processing task for creating the exact copy of an object. If we perform it by
//using the new keyword, it will take a lot of processing to be performed that is why we use object cloning.

public class StudentCloning implements Cloneable
{
	int rollno;
	String name;

	StudentCloning(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	

	public static void main(String args[]) {
		try {
			StudentCloning s1 = new StudentCloning(101, "amit");
			StudentCloning s2 = (StudentCloning) s1.clone();
			System.out.println(s1.rollno + " " + s1.name);
			System.out.println(s2.rollno + " " + s2.name);
			
			System.out.println(s1==s2);
			
			System.out.println(s1.hashCode());
			System.out.println(s2.hashCode());
		} catch (CloneNotSupportedException c) {
		}
	}
}