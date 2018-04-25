package others_14;



public class ScopeTest 
{
	final static int i=2;
	public static void main(String[] args)
	{
		System.out.println("Before Change "+i);
		change(i);
		System.out.println("After Change "+i);
	}
	
	static void change(int num)     //If final is used as argument then, you can't manipulate 'num'.
	{
		num=num+1;	
		System.out.println("Number Changed "+num);
	}

}
