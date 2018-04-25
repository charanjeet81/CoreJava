package string_15;
//check for two Iteration.
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Test9 
{
	public static void main(String[] args) throws IOException
	{
		File folder = new File("C:\\Users\\prince\\Desktop\\Folder");
		folder.mkdir();  //It will create a directory or folder.
		System.out.println(folder.isDirectory());
		File file = new File(folder, "NewFile.txt");
		System.out.println(file.isFile()+"  "+file.exists());
		BufferedWriter bw = new BufferedWriter(new FileWriter(file)); //implicit "createNewFile()" call.
		System.out.println(file.isFile()+"  "+file.exists());
		bw.write("Hello, I am file under folder.");
		bw.flush();
		bw.close();	
	}
}
