package others_14;

class Checkk
{
	//"var-args" can be used in combined form with "Widening" and "Boxing", and both will be called.
	void var_Widening(long... l)     // var-args with Widening.
	{
		System.out.println("var-args with widening.");
	}
	void var_Boxing(Integer... l)    // var-args with Boxing.
	{
		System.out.println("var-args with Boxing.");
	}	
	void common(long... l)     
	{
		System.out.println("COMMON: var-args with widening.");
	}
	void common(Integer... l)  
	{
		System.out.println("COMMON: var-args with Boxing.");
	}	
}

public class WBV_Test1 
{
	static void go(long l)  // only widening can be done, "static void go(Long l)" will show error, because widening and Boxing can't happen together. 
	{
		System.out.println("hello");		
	}
	public static void main(String[] args)
	{
		int i=5;
		go(i);
		
		Checkk c = new Checkk();
		c.var_Boxing(i,i);
		c.var_Widening(i,i);	
	}
}
