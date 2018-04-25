package fileIO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/*The PrintStream class provides methods to write data to another stream. The PrintStream class automatically
 flushes the data so there is no need to call flush() method. Moreover, its methods don't throw IOException.
 */
public class FileTest15
{
	public static void main(String[] args) throws IOException
	{
		int a = 9;
		FileOutputStream fout = new FileOutputStream(System.getProperty("user.home") + "\\Desktop\\file\\A.txt");
		PrintStream ps = new PrintStream(fout);
		ps.println("Hello I am here...");
		ps.printf("%d", a);
		ps.close();
	}
}
