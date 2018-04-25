package fileIO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

//Writing to a file A.txt present  using FileOutputStream

public class FileTest2 {

	public static void main(String[] args) throws IOException 
	{
		String filePath = System.getProperty("user.home")+"\\Desktop\\A.txt";
		FileOutputStream fout = new FileOutputStream(new File(filePath)); 
		String s = "Hello! how are you.";
		byte[] b = s.getBytes();
		fout.write(b);
		fout.flush();
		fout.close();
	}
}
