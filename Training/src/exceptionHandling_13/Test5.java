package exceptionHandling_13;

//Difference between throws and throw(used for user-defined-exception).

public class Test5
{
	public static void main(String[] args)  throws InterruptedException
	{
		fxn1();
	}
	public static void fxn1() throws InterruptedException
	{
		fxn2();
	}
	public static void fxn2() throws InterruptedException
	{
		Thread.sleep(3000);
	}
}
