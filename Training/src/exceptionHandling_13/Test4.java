package exceptionHandling_13;

// one try can have multiple "catch"
public class Test4 
{
	public static void main(String[] args) 
	{
		try 
		{
			System.out.println("1");
			Thread.sleep(3000);
			System.out.println("2");
			int c = 13/0;
			System.out.println("3");
		} 
		// catch(Exception e) { } No point of putting super-exception first or sub-exceptions later.
		catch (InterruptedException ie)    //Unreachable catch block for InterruptedException. It is already handled by the catch block for Exception, if super exception is kept first.
		{
			System.out.println("Thread Exception.");
		}
		catch (ArithmeticException ae) 
		{
			System.out.println("Divide by zero.");
		}
		System.out.println("4");
	}
}
