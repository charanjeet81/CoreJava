package operators_14;
//System.out.println(5&6); //"&"-> Bitwise Operator; "&&"-> Short-Circuit operator
//System.out.println(5&&6);  can't operate

import java.util.Scanner;

public class Test6 
{
	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First No :");
		int a = sc.nextInt();
		System.out.println("Enter Second No :");
		int b = sc.nextInt();
		System.out.println("Enter Operator out of '+, -, *, /' :");
		char c = sc.next().charAt(0);
		switch(c)
		{
		case '+' : System.out.println(a+b);
				   break;
		case '-' : System.out.println(a-b);
				   break;
		case '*' : System.out.println(a*b);
		           break;
		case '/' : System.out.println(a/b);
		           break;
		 default : System.out.println("Your Operator is out of scope.");
		}

	}

}
