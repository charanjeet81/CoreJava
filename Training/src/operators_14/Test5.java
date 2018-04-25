package operators_14;
//conditional operator.
import java.util.Scanner;

public class Test5 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First No :");
		int a = sc.nextInt();
		System.out.println("Enter Second No :");
		int b = sc.nextInt();
		System.out.println("Enter Third No :");
		int c = sc.nextInt();
		int largest = ((a>b) & (a>c)) ? (a) : ((b>c) ? b : c) ;
		System.out.println("Largest No is : "+largest);
		
	
	}

}
