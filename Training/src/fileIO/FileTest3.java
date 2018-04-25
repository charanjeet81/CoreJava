package fileIO;

import java.io.FileInputStream;
import java.io.IOException;

//Reading from a file A.txt using FileInputStream

public class FileTest3 
{
	public static void main(String[] args) throws IOException 
	{
		int status = 0;
		String filePath = System.getProperty("user.home")+"\\Desktop\\A.txt";
		FileInputStream fin = new FileInputStream(filePath);
		while((status=fin.read())!=-1)
		{
			System.out.print((char)status);			
		}
		fin.close();
	}
}
