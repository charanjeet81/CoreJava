package fileIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//Reading from a file A.txt and writing to B.txt.

public class FileTest4 
{
	public static void main(String[] args) throws IOException 
	{
		int status = 0;
		String srcFile = System.getProperty("user.home")+"\\Desktop\\A.txt";
		String destFile = System.getProperty("user.home")+"\\Desktop\\B.txt";
		FileInputStream fin = new FileInputStream(new File(srcFile));
		FileOutputStream fout = new FileOutputStream(new File(destFile));
		while((status=fin.read())!=-1)
		{
			fout.write(status);
		}
		fout.flush();
		fout.close();
		fin.close();
		System.out.println("Data written successfully.");
	}
}
