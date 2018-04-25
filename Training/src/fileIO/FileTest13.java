package fileIO;

import java.io.IOException;
import java.util.Scanner;
//next() will just take first word seperated by space, whereas nextLine() will take full line.
public class FileTest13
{
	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter some input:");
		String s = sc.nextLine();
		System.out.println(s);
		sc.close();
		
	}
}
