package string_15;

public class Test4 
{   
	static int sum = 0;
	public static void main(String[] args) 
	{
		String x = "Welcome to Java Site.";
		String[] total = x.split(" ");
		for(String s : total)
		{
			System.out.println(s);
		}
		System.out.println(total[2]);      //Java
		//--------------------------------
		String y = "PROMOCODE:3489";
		String[] col = y.split(":", 2);
		for(String s : col)
		{
			System.out.println(s);
		}
		System.out.println(col[1]);        //3489
		//--------------------------------		
		String z = "I have 3 pencils 4 pens and 4 books.";
		String[] tot = z.split(" ");
		point: 
		for(String t : tot)
		{   
			try
			{		    
				int a = Integer.parseInt(t);
				sum = sum + a;			
			}catch(Exception e)
			{
				continue point;
			}		
		}
		System.out.println(sum);			
	}

}
