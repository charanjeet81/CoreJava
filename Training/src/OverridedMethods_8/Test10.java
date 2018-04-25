package OverridedMethods_8;


//USE OF instanceof operator.
interface WebDriver
{
	public void get();
}

class FireFox implements WebDriver
{
	public void get()
	{
		System.out.println("Opening FireFox.");
	}
}

class Chrome implements WebDriver
{
	public void get()
	{
		System.out.println("Opening Chrome.");
	}
}

class Calling 
{
	public void open(WebDriver driver)
	{
		if(driver instanceof FireFox)
		{
			FireFox ff = (FireFox)driver;  //downcasting
			ff.get();
		}
		if(driver instanceof Chrome)       //downcasting
		{
			Chrome ch = (Chrome)driver;
			ch.get();
		}		
	}
}


public class Test10 
{
	public static void main(String[] args) 
	{
		WebDriver driver1 = new FireFox();
		Calling c1 = new Calling();
		c1.open(driver1);		
		
		WebDriver driver2 = new Chrome();
		Calling c2 = new Calling();
		c2.open(driver2);	
	}
}
