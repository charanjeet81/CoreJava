package fileIO;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/*Java ByteArrayOutputStream class is used to write data into multiple files. In this stream, the data is written into a byte array that can be written to multiple stream.
The ByteArrayOutputStream holds a copy of data and forwards it to multiple streams.
*/
public class FileTest5 
{
	public static void main(String[] args) throws IOException 
	{
		FileOutputStream fout1 = new FileOutputStream(new File("C:\\Users\\465839\\Desktop\\A.txt"));
		FileOutputStream fout2 = new FileOutputStream(new File("C:\\Users\\465839\\Desktop\\B.doc"));
		
		String s = "INDIAN";	
		ByteArrayOutputStream bout = new ByteArrayOutputStream();
		bout.write(65);
		bout.write(s.getBytes());
		bout.writeTo(fout1);
		bout.writeTo(fout2);
		bout.flush();
		bout.close();
		
		System.out.println("Data written in both the files.");
	}
}
