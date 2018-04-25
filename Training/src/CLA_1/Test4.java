package CLA_1;

public class Test4
{
    public static void main(String[] x)
	{
		calculate(x);
	}	
	
	 /**Example of giving the comments.  
	  * 
	  * @throws Interrupted Exception
	  * @return Return Typr is void
	  * @since 2nd Jan - 2016 
	  * @desc This class will hold functions for user interaction
	  * examples include user_pass(), user_username(), user_age(), user_regdate()
	  * @author Jake Rocheleau jakerocheleau@gmail.com
	  * @required Settings.php
	*/
	public static void calculate(String[] y)  //Command Line Argument should be seperated by space.
	{
		int sum =0;
		for(String s : y)
	    {
			sum = sum + Integer.parseInt(s);	 		
		}
		System.out.print("Sum is: "+sum);
	}
}