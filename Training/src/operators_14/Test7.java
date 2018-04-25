package operators_14;

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First No :");
		int a = sc.nextInt();
		System.out.println("Enter Second No :");
		int b = sc.nextInt();
		System.out.println("Enter Operator out of '+, -, *, /' :");
		char c = sc.next().charAt(0);
		if(c=='+')
			System.out.println(a+b);
		else if (c=='-') 
			System.out.println(a-b);
		else if (c=='*') 
			System.out.println(a*b);
		else  
			System.out.println(a/b);
	}
}
