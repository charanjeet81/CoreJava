package fileIO;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileTest9
{
	public static void main(String[] args) throws IOException
	{
		String filePath = "C:\\Users\\prince\\Desktop\\file\\A.txt";
		//For reading data from any file using BufferedInputStream
		BufferedInputStream bin = new BufferedInputStream(new FileInputStream(new File(filePath)));
		int status = 0 ;
		while((status=bin.read())!=-1)
			System.out.print((char)status);
		bin.close();
	}
}
