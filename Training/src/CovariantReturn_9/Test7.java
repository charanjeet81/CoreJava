package CovariantReturn_9;

import java.io.File;
import java.io.IOException;

/*Stream classes are used to read and write bytes like DataInputStream, and Readers and Writers
are used to read and write characters.
 * 
 * 
 * 
 * */

//CREATING NEW FILE.
public class Test7 
{
	public static void main(String[] args) 
	{
		try
		{
			File file = new File("C:\\Users\\prince\\Desktop\\SecondFile.xls"); //just creating file obj, path and name.
			System.out.println(file.exists());   //In first execution it will give false, then true. 
			file.createNewFile();                //return boolean
			System.out.println(file.exists());   //In first execution it will give true as file has been created.
		}catch(IOException io)
		{
			io.printStackTrace();
		}
	}
}
