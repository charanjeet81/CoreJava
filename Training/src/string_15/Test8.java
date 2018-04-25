package string_15;

import java.io.File;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

class Test8 {

	public static void main(String [] args) {
		try{
			char[] in = new char[150];
			int size = 0;
			File file = new File("first.txt");
			FileWriter fw = new FileWriter(file);
			fw.write("using filewriter...\n");
			fw.flush();
			//fw.close();
            //----------------------------------------------------
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("using BufferWriter...\n");
		    bw.newLine();
			bw.flush();
			//bw.close();            //If it is not commented than PrintWriter will not get Printed
			//------------------------------------------------			
			PrintWriter pw = new PrintWriter(fw);
			pw.println("using PrintWriter..."); //write(). print(), printf();
			pw.flush();
			pw.close();
			//----------------------------------------------------
			
			FileReader fr = new FileReader(file);
			//BufferedReader br = new BufferedReader(fr);       //how to print whole data ?
			//String data = br.readLine();
			//System.out.println(data);
			size = fr.read(in);
			System.out.println("Size is ="+size);
			for(char ch : in)
			System.out.print(ch);
			fr.close();		
}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	}