package array_12;

public class ArrayTest7 
{
	public static void main(String[] args) 
	{
		byte b = 4;
		short s = 7;
		char c = 'A';  // It will print ASCII value.
		int[] list = new int[3];
		list[0] = b;
		list[1] = s;
		list[2] = c;
		
		for (int i : list)
		{
		 System.out.println(i);	
		}
	}
}
