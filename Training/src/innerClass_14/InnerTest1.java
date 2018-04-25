package innerClass_14;

import innerClass_14.Outer.Inner;

class Outerr
{	
	private int a = 3;
	void outerFxn()
	{
		System.out.println("I am in outer class, but can't use private values of Inner.");
	}
		class Innerr
		{
			private int b = 4;
			void innerFxn()
			{
				System.out.println("I'm in inner class using private values of Outer: "+a);
			}
		}
}

public class InnerTest1 
{
	public static void main(String[] args) 
	{
		Outerr o = new Outerr();
		o.outerFxn();
		
		Outerr.Innerr oi = o.new Innerr();   //Outerr.Innerr oi = new Outerr().new Innerr();
		oi.innerFxn();                                                                                                                                                                                                                                          
	}
}
