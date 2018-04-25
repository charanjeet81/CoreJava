package fileIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*There are many ways to read data from the keyboard. For example:
InputStreamReader
Console
Scanner
DataInputStream etc.

InputStreamReader class can be used to read data from keyboard.It performs two tasks:
-connects to input stream of keyboard
-converts the byte-oriented stream into character-oriented stream
*/

public class FileTest12
{
	public static void main(String[] args) throws IOException
	{
		InputStreamReader sr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(sr);
		while(true)
		{
			System.out.println("Enter Your Name:");
			String name = br.readLine();
			if(name.isEmpty())
				break;			
			System.out.println("Your name is: "+name);
		}
	}
}
