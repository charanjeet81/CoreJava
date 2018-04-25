package DataStructure;
import java.util.Scanner;

public class ArrayTest1 {

	public static void main(String[] args)
	{
		int[] arr = new int[]{4,6,2,8,10};
		System.err.println("Your array : {4,6,2,8,10}");
		String input = null;
		do
		{
			System.out.println("Traverse element from Start-S / End-E, press accordingly: ");
			Scanner sc  = new Scanner(System.in);
			input = sc.nextLine();
			if(input.equals("S"))
			{
				System.out.println("Enter position from start: ");
				int startPos  = sc.nextInt();
				System.out.println("Element from start @ position "+startPos+" is: "+arr[startPos-1]);
			}
			else
			{
				System.out.println("Enter position from end: ");
				int endPos  = sc.nextInt();
				System.out.println("Element from start @ position "+endPos+" is: "+arr[arr.length-endPos]);
			}
			System.out.println("Do you want to continue Y/N: ");
			input = sc.next();
		}while(input.equals("Y"));		
	}
}
