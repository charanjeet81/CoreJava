package string_15;

import java.io.File;
import java.io.IOException;

public class Test5
{
	public static void main(String[] args) throws IOException
	{
		File f = new File(System.getProperty("user.dir")+"\\sample.txt");//It's not creating any file, just creating a reference, where you want to perform action.
		System.out.println(f.exists());
		System.out.println(f.createNewFile());
		System.out.println(f.exists());		
	}

}

