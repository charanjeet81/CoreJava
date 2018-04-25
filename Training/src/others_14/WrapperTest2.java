package others_14;
//Q. If Wrapper Classes are immutable then how it change the value.


public class WrapperTest2 
{
	public static void main(String[] args) 
	{
		Integer i = 34;
		Integer j = i;
		System.out.println(i==j);  //Checking reference; gives "true", because both referring to same object.
		j++;                       //Auto-unboxing, then use it(increment), then Auto-Boxing
		System.out.println(i==j);  //Checking reference; gives "false", because both referring to different object.
	
		System.out.println("========================================");
		
		String s1 = "Hello";
		String s2 = s1;
		System.out.println(s1==s2);
		s1 = s1 + " Java.";
		System.out.println(s1==s2);
	}
}
