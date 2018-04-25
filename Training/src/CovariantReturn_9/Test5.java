package CovariantReturn_9;


//Difference between "length" and "length()"
public class Test5 
{
	public static void main(String[] args) 
	{ 
		String x = "Hello";
		System.out.println(x.length()); //length()used with string

		String[] y = new String[]{"Hello", "Hi","Bye"};
		System.out.println(y.length);	//length used with string
	}
}
