package innerClass_14;


class Outer
{
	private int x = 3;
	public void oFxn()
	{
		Inner i = new Inner();
		i.iFxn();
	}
	
	class Inner
	{
		private int x = 4;
		public void iFxn()
		{
			System.out.println("Outer's private member :"+x);
			System.out.println("Outer's reference :"+ Outer.this.x);
			System.out.println("Inner's reference :"+ this.x);
			System.out.println();
		}		
	}
}
public class InnerTest2 
{
	public static void main(String[] args) 
	{
		Outer.Inner oi = new Outer().new Inner();
		oi.iFxn(); 
	}

}
