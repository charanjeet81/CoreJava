package fileIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

//Java SequenceInputStream class is used to read data from multiple streams. It reads data of streams one by one.

public class FileTest6 
{
	public static void main(String[] args) throws IOException 
	{
		FileInputStream fin1 = new FileInputStream(new File("C:\\Users\\prince\\Desktop\\file\\A.txt"));
		FileInputStream fin2 = new FileInputStream(new File("C:\\Users\\prince\\Desktop\\file\\B.doc"));
		FileOutputStream fout = new FileOutputStream(new File("C:\\Users\\prince\\Desktop\\file\\C.txt"));
		//It will create file automatically.
		
		int status = 0;
		SequenceInputStream sis = new SequenceInputStream(fin1, fin2);
		while((status=sis.read())!=-1)
		{
			System.out.println((char)status);
			fout.write((char)status);
		}
		sis.close();
		fin1.close();
		fin2.close();
		fout.close();
	}
}
