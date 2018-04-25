package others_14;

import java.util.Calendar;

/*
1. during web development or for other application where objects are created, then its good
	 if these objects are destroyed once they have completed their job, otherwise it will give 
	 rise in memory, and for web application there will be overhead on server. 
2. In other languages like c++, programmer is responsible for Object destruction after its use.
3. But in Java programmer's concern is only with creating object, not destroying them.
4. Java people has provided some assist of collecting these useless objects, is known as 
   "garbage collection".
5. It is the responsibility of JVM to call "garbage collector".
6. As a programmer you can only remind JVM to run "garbage collector" but there is no guarantee
   that it will run gc in next step.
7. It means you can't request JVM to run gc, explicitly. 
You can only make a object eligible for garbage collection by the following ways.
1. Nullify.
2. Reassigning to older reference.
3. Object created inside a method.
4. Island of objects.
*/


class GC
{
	
	
}

public class GCTest1 {	
	static String s1 = new String("Amazing");
	static String s2 = new String("Java");
	
	public static void main(String[] args) 
	{
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		System.out.println(s1.equals(s2));
		System.gc();
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		//Calendar c = Calendar.getInstance();
		//System.out.println(c.getTime());
	}

}








