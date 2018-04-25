package others_14;
//Java lets you restrict to having one of only few predefined value

/*enum CupSize{SMALL, MEDIUM, LARGE};   //outside 'enum' can't be private.

public class Coffee 
{
	CupSize size;
	public static void main(String[] args) 
	{		
		Coffee c = new Coffee();
		c.size = CupSize.MEDIUM;
		System.out.println(c.size);
	}
}*/

public class Coffee 
{
	enum CupSize{SMALL,MEDIUM,LARGE};   //'enum' can't be inside a class.
	CupSize size;
	
	public static void main(String[] args) 
	{		
		Coffee c = new Coffee();
		c.size = Coffee.CupSize.SMALL;     //CupSize.MEDIUM;
		System.out.println(c.size);
	}

}
