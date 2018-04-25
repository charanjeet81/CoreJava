package exceptionHandling_13;
//hierarchy

//checked uncheck

/*try
{    
	//try some risk-work here.
}catch(Exception e){
    //manage your risk here.
}*/
public class Test3 
{	
	public static void main(String[] args) throws InterruptedException
	{
		try
		{   
			System.out.println("1");
			Thread.sleep(3000);   // checked exception shows error.
			int c = 13/0;
			System.out.println("2");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println(e.getStackTrace());
			e.printStackTrace();
			System.out.println(e.toString());
		}
	}
}
