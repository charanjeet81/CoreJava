package fileIO;

import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest11 
{
	public static void main(String[] args) throws IOException 
	{
		String filePath = System.getProperty("user.home")+"\\Desktop\\file";

		CharArrayWriter out = new CharArrayWriter();
		out.write("Helo, Good Morning.");
		
		FileWriter fw1 = new FileWriter(filePath+"\\A.txt");
		FileWriter fw2 = new FileWriter(filePath+"\\B.txt");
		
		out.writeTo(fw1);
		out.writeTo(fw2);		
		
		out.flush();
		out.close();
		fw1.close();
		fw2.close();
		//You will not get any warning even if you are not closing CharArrayWriter, but FileWriter you have to close.
	}
}

