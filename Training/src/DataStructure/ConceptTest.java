package DataStructure;

class Student {
	int num = 1002;
	Student(int num)
	{
		this.num = num;
	}

	public void displayNum() {
		System.out.println(num);
	}
}

public class ConceptTest {

	public static void main(String[] args) {
		String s3 = new String("PAJI");
		String s4 = new String("PAJI");
		System.out.println(s3.equals(s4));
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		Student s1 = new Student(24);
		Student s2 = new Student(24);
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1.toString());
	}
}
