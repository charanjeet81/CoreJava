package exceptionHandling_13;

/*try
{    
	//try some risky-work here.
}catch(Exception e){
    //manage your risk here.
}*/

/*public class Test2{

    public static void main(String []args)
    {
       fxn1();  
    }
    public static void fxn1()
    {
       fxn2();             //It will throw to "main(), and handled by main()"
    }
    public static void fxn2()
    {
       int c = 13/0;        //Exception will come here, and throw to calling function i.e. "fxn1()"
	}
}*/

//In side any method if Exception occurs, then it creates the object of that exception and over to the
// JVM then JVM checks whether it is containing the handling code or not.
//If it does not contain exception handling code then it passes it to the caller, which calls that function, and checks in
//that function for the exception, and this process continue until main().
//If handler is still not found then JVM handle the exception showing stack trace for that.
//


public class Test2
{
    public static void main(String []args)
    {
       fxn1();  
    }
    public static void fxn1()
    {
       fxn2();             //It will throw to "main(), and handled by main()"
    }
    public static void fxn2()
    {
    	try 
    	{
    		 int c = 13/0;        //Exception will come here, and throw to calling function i.e. "fxn1()" and then back to main().
		} 
    	catch (Exception e) 
    	{
    		System.out.println(e.getMessage());
    		System.out.println("===============");
    		System.out.println(e.getStackTrace());
    		System.out.println("===============");
    		e.printStackTrace();	
    		System.out.println("===============");
    		System.out.println(e.toString());
		}
	}
}












