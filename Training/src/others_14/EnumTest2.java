package others_14;
//1. Initializing specific values to the enum constants.
//2. The enum constants have initial value that starts from 0, 1, 2, 3 and so on. But we can initialize 
//the specific value to the enum constants by defining fields and constructors. As specified earlier, 
//Enum can have fields, constructors and methods.
//3. Constructor of enum type is private. If you don't declare private compiler internally creates
//private constructor.
/*4. Can we create the instance of enum by new keyword?
No, because it contains private constructors only.
Can we have abstract method in enum?
Yes, ofcourse! we can have abstract methods and can provide the implementation of these methods.*/
public class EnumTest2 
{
	enum Season 
	{
		WINTER(5), 
		SPRING(10), 
		SUMMER(15), 
		FALL(20);

		private int value;

		private Season(int value) 
		{
			this.value = value;
		}
	}

	public static void main(String args[])
	{
		for (Season s : Season.values())
			System.out.println(s.name() + " " + s.value);
	}
}

