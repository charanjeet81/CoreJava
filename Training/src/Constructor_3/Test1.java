/* Typically, constructors are used to initialize instance variable state at run time.
 * All init-blocks are called before constructor call.
 * Constructors are of three types: 1. Default constructor(provided by JVM), 2. Non-parameterised, 3. Parameterised Cons
* Every class, including abstract classes, MUST have a constructor.
* Two key points to remember about constructors are that they have no return type and their names must exactly match the class name. 
* You can't make a new object with invoking just the constructor of the object's actual class type, but also the constructor of each of its super classes! (if inheritance is achieved.)
* Constructors can use any access modifier, including private. (for private constructor object can be instantiated within the class(than make methods / variable 
static for invoking by class name.)
* You could have both a method(if return type before a constructor) and a constructor with the same name.
* Default constructor is provided by JVM if you give your own than JVM stops providing no-arg default constructor.
* In the very first line of the constructor there can either "super()/super(...)" or "this()/this(...)".(but there can this.m(); and super.m(); multiple times in other lines.).
* super class constructor is also called by super-call, when you create sub class object.
* The default constructor has the same access modifier as the class. The default constructor has no arguments.The default constructor includes a no-arg call to the super constructor.
* If your superclass does not have a no-arg constructor, then in your subclass you will not be able to use the default constructor supplied by the compiler.*/


package Constructor_3;

class Student
{ 
	private int rollNo;
	private String name;
	private int age;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age<100)
		{
			this.age = age;
		}	
		else
			System.out.println("Age Incorrect, it can't exceed 100 so defaule is 0.");
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNO(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void display()
	{
		System.out.println("Student's name is - "+getName()+" age is - "+getAge()+" and roll number is - "+getRollNo());
	}
}

public class Test1 
{
	public static void main(String[] args)
	{
		Student stu1 = new Student();
		stu1.setName("Tom");
		stu1.setAge(20);
		stu1.setRollNO(1001);
		stu1.display();
		
		Student stu2 = new Student();
		stu2.setName("Jerry");
		stu2.setAge(200);
		stu2.setRollNO(1002);
		stu2.display();
		
		stu1 = stu2;
		stu1.display();
	}
}