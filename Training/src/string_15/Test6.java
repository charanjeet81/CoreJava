package string_15;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test6 
{
	public static void main(String[] args) throws IOException
	{
		int size = 0;
		char[] in = new char[100];
		
		//Writing in file. 
		File f = new File("D:\\workD\\Training\\sample.txt");
		FileWriter fw = new FileWriter(f);
		fw.write("Hello H R U ? Dude\n");
		fw.append("I am fine");
		fw.flush();     //Used for flushing your content.
		fw.close();
		
		//Reading from file.
		FileReader fr = new FileReader(new File("D:\\workD\\Training\\sample.txt"));
		size = fr.read(in); 
		System.out.println(size);
		for(char ch : in)
		{
			System.out.print(ch);
		}	
		fr.close();		
	}

}
