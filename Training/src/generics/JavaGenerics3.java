package generics;

/*The type parameters naming conventions are important to learn generics thoroughly. The commonly type parameters are as follows:

T - Type
E - Element
K - Key
N - Number
V - Value
Like generic class, we can create generic method that can accept any type of argument.*/

public class JavaGenerics3 {

	public static <E> void printArray(E[] elements)
	{
		for (E element : elements)
		{
			System.out.println(element);
		}
	}
	
	public static <E> void display(E element)
	{
		System.out.println(element);
	}

	public static void main(String args[])
	{
		Integer[] intArray = { 10, 20, 30, 40, 50 };
		Character[] charArray = { 'J', 'A', 'V', 'A', 'T', 'P', 'O', 'I', 'N','T' };

		System.out.println("Printing Integer Array");
		printArray(intArray);

		System.out.println("Printing Character Array");
		printArray(charArray);
		
		display("Hello");
		
		display(5);
		
		display(3.4);
	}
}