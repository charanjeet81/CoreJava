package others_14;
//WBV - Widening, Boxing, Var-args.
//Whenever you have options between these three then use this order: Widening>Boxing>Var-args  
class Check
{
	void fxn1(Integer j)
	{
		System.out.println("Boxing");
	}
	void fxn1(long l)
	{
		System.out.println("Widening");
	}
	
	void fxn2(Byte b1, Byte b2)
	{
		System.out.println("Boxing");
	}
	void fxn2(byte... b)
	{
		System.out.println("Variable-Length-Argument");
	}
	
	void fxn3(int j, int k)
	{
		System.out.println("Widening");
	}
	void fxn3(byte... l)
	{
		System.out.println("Variable-Length-Argument");
	}	
}

public class WBV_Test 
{
	public static void main(String[] args) 
	{
		Check ch = new Check();
		
		int i=5;
		ch.fxn1(i);       //has conflict between, Boxing and Widening: will go for Widening.
		
		byte a=4, b=5;
		ch.fxn2(a,b);     //has conflict between, Boxing and var-args: will go for Boxing.
		
		ch.fxn3(a,b);	  //has conflict between, Widening and var-args: will go for Widening.	
	}
}
