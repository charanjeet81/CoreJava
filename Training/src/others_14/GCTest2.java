package others_14;

import java.util.Date;

import javax.xml.crypto.Data;


/*Runtime is singleton class (implements singleton-design-pattern), which has only one object and can't be created using its constructor.
like: Calendar c = Calendar.getInstance();
	  System.out.println(c.getTime());
	  Runtime r = Runtime.getRuntime();
	  
*Spring and Selenium testing framework follows singleton pattern whereas Hibernate follows Factory method pattern.
*/
public class GCTest2 
{
	public static void main(String[] args) throws InterruptedException
	{
		Runtime r = Runtime.getRuntime();
		System.out.println("Before Object creation : ");
		System.out.println("Total : "+r.totalMemory());
		System.out.println("Free : "+r.freeMemory());
		
		for(int i=1 ; i<=1000 ; i++)
		{
			System.out.println(new Long(i));
		}
		
		System.out.println("After Object creation : ");
		System.out.println("Total : "+r.totalMemory());
		System.out.println("Free : "+r.freeMemory());
		
		Runtime.getRuntime().gc();
		
		Thread.sleep(9000);
		
		System.out.println("After gc() run : ");
		System.out.println("Total : "+r.totalMemory());
		System.out.println("Free : "+r.freeMemory());
	}
}
