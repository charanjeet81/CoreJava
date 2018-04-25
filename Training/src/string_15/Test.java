package string_15;

/*String s = "abc"; // creates one String object and one reference variable
String s = new String("abc"); // creates two objects, and one reference variable
*/

// equals(): It checks value.
// "==" : It checks reference
public class Test
{
	public static void main(String[] args) 
	{
		String s1 = "Hello";      //Simply go to string-constant-pool.
		String s2 = "Hello";      //"Hello" is already there, so no repetition for same string.
		System.out.println(s1.equals(s2));  //true
	    System.out.println(s1==s2); 		//true
		
		String s3 =  new String("Hello"); //one "Hello" will go to "String-Pool" and one "Hello" will go to "Heap".
		String s4 = new String("Hello");  //one "Hello" will go to "Heap" only and there will be no repetion of same string in "String-Pool"
		System.out.println(s3.equals(s4));  //true
		System.out.println(s3==s4);         //false
	}
}
