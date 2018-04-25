package others_14;
import java.util.Scanner;

import CLA_1.*;

public class PackageUse {	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Value :");
		int a = sc.nextInt();
		System.out.println("Enter Second Value :");
		int b = sc.nextInt();
		System.out.println(Maths.sum(a,b));
//		Maths m = new Maths();  //if you will make the constructor of Maths class private, then you can't create obj here.
// 		m.div(a,b);
		/*System.
		out    .    println    
		                (  "  " +
		                		"      hello    " );*/
		
	}

}
