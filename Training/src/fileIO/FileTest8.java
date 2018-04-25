package fileIO;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
//BufferedInputStream and BufferedOutputStream make use of buffer to store some data in advance and make the 
//performance better and faster.

public class FileTest8
{	
	public static void main(String[] args) throws IOException
	{
		String filePath = "C:\\Users\\prince\\Desktop\\file\\A.txt";
		String s = "Some message.";
		BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream(new File(filePath)));
		bout.write(s.getBytes());
		bout.flush();
		bout.close();		
	}
}
