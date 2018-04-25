package string_15;

import java.io.File;

public class Test10 
{
	public static void main(String[] args) 
	{
		File folder = new File("C:\\Users\\prince\\Desktop\\javaBlog");
		String[] everything = folder.list();  
		for(String a : everything) //It will take all the files and folders one-by-one.
		{
			if(a.equals("SQL"))    //It will match weather "SQL" is there in folder "javaBlog".
			{
				System.out.println("TRUE");
			}
		}
		//we can use renameTo() and delete(), for renaming and deleting files.
		

	}

}
