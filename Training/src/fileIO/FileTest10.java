package fileIO;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*-Java FileWriter and FileReader classes are used to write and read data from text files. These are 
character-oriented classes, used for file handling in java.
-Java has suggested not to use the FileInputStream and FileOutputStream classes if you have to read and write the
textual information.
-FileWriter(String file): creates a new file automatically. It gets file name in string.
-FileWriter(File file): creates a new file. It gets file name in File object.
-public void write(String text)/write(char c)/write(char[] c)
*
*/
public class FileTest10 
{
	public static void main(String[] args) throws IOException 
	{
		String filePath = System.getProperty("user.home")+"\\Desktop\\file\\A.txt";
		FileWriter fw = new FileWriter(filePath);
		fw.write("Hello friends!!! H R U ?");
		fw.flush();
		fw.close();
		System.out.println("Data written to file path: "+filePath);
		
		int status = 0;
		FileReader fr = new FileReader(new File(filePath));
		while((status=fr.read())!=-1)
			System.out.print((char)status);
		fr.close();
	}
}
