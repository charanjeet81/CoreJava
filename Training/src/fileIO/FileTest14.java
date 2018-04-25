package fileIO;

import java.io.Console;
//The Java Console class is be used to get input from console. It provides methods to read text and password.
//If you read password using Console class, it will not be displayed to the user.
public class FileTest14 
{
	public static void main(String[] args) 
	{
		Console c = System.console();
		System.out.println("Enter Your User Name: ");
		String name = c.readLine();
		System.out.println("User name is: "+name);
		System.out.println("Enter password: ");  
		char[] ch = c.readPassword();
		String pass = String.valueOf(ch);// converting char array into string
		System.out.println("Password is: " + pass);
	}
}