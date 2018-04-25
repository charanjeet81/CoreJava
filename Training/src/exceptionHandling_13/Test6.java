package exceptionHandling_13;

public class Test6 
{
	public static void main(String[] args) 
	{ 
		int balance = 750; 
		if (balance<1000)
		{
			throw new LowBalanceException();
		}
	}
}

class LowBalanceException extends RuntimeException
{
	LowBalanceException()
	{
		System.out.println("Your Balance is less than 1000.");
	}
}
