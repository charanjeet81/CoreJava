package CovariantReturn_9;

//The StringBuffer and StringBuilder Classes
/*1. The java.lang.StringBuffer and java.lang.StringBuilder classes should be used when
you have to make a lot of modifications to strings of characters.
2. String objects are immutable, so if you choose to do a lot of
manipulations with String objects, you will end up with a lot of abandoned String
objects in the String pool.
3. A common use for StringBuffers and StringBuilders is file I/O when large,
ever-changing streams of input are being handled by the program. In these
cases, large blocks of characters are handled as units, and StringBuffer
objects are the ideal way to handle a block of data, pass it on, and then
reuse the same memory to handle the next block of data.
4. Only difference between "StringBuffer" and "StringBuilder" is "StringBuffer's methods are thread- 
safe whereas StringBuilder's methods are not thread-safe so run fast.
5. Oracle recommends that you use StringBuilder instead of StringBuffer whenever possible
because StringBuilder will run faster.*/



public class Test6 
{
	public static void main(String[] args) 
	{
		String s1 = new String("ABC");
		s1.concat("DEF");
		System.out.println(s1);  //ABC, because of immutable nature, original string is not change.
		
		StringBuffer s2 = new StringBuffer("ABC");
		s2.append("DEF");
		System.out.println(s2);  //ABCDEF
		
		StringBuilder s3 = new StringBuilder("ABC");
		s3.append("DEF").reverse().insert(3, "---");
		System.out.println(s3);
		s3.delete(3, 6).reverse();
		System.out.println(s3);
	}
}
