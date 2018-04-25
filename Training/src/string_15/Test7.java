package string_15;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Test7 
{
	public static void main(String[] args) throws IOException 
	{
		File f = new File("C:\\Users\\prince\\Desktop\\BW_File.doc");
		FileWriter fw = new FileWriter(f); //create new file, assign File f, make reference fw 
		PrintWriter pw = new PrintWriter(fw);
		pw.write("Line By Line\n");
		pw.println("Line 1.");
		pw.println("Line 2.");
		pw.println("Line 3.");
		pw.append("Line 4.");
		pw.flush();
		pw.close();	
		
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String data ;
		while((data = br.readLine())!=null)
		{
			System.out.println(data);
		}		
	}
}
