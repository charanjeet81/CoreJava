package others_14;


public class Random 
{
	static String[] names = {"BATMAN","SUPERMAN","SPIDERMAN","X-MAN","IRON-MAN"};
	public static void main(String[] args) 
	{
		for(int i=1;i<=10;i++)
		{
			int x = (int)(Math.random()*5);
			System.out.println(names[x]);
		}
	}		
}
