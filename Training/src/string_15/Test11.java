package string_15;

/*The Console class makes it easy to accept input from the command line, both
echoed and nonechoed (such as a password), and makes it easy to write formatted
output to the command line.
*The readLine method returns a String.CASE_INSENSITIVE_ORDER
*However, the readPassword method doesn't return a string: it returns a character array
If a string was returned, it could exist in a pool somewhere in memory and perhaps some
nefarious hacker could find it.*/
import java.io.Console;
public class Test11
{
	public static void main(String[] args) 
	{
		Console c = System.console(); // #1: get a Console
		char[] pw;
		pw = c.readPassword("%s", "pw: "); // #2: return a char[]
		for(char ch: pw)
		c.format("%c ", ch); // #3: format output
		c.format("\n");
		MyUtility mu = new MyUtility();
		while(true) 
		{
			String name = c.readLine("%s", "input?: "); // #4: return a String
			c.format("output: %s \n", mu.doStuff(name));
		}
	}
}
	class MyUtility     // #5: class to test
	{
		String doStuff(String arg1) 
		{
			return "result is " + arg1;
	    }
	}
