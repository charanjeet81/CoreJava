package operators_14;

import javax.swing.JButton;

public class Test1 
{
	public static void main(String[] args) 
	{
		//"==" check the value in following case.
		System.out.println('A'==65);      //true, char is checked with ASCII value.
		System.out.println(5==6);         //false
		System.out.println(5!=6);		  //true
		System.out.println(5.0==5);       //true
		System.out.println(5.0f==5L);     //true
		
		//"==" check the reference in following case.
		JButton b1 = new JButton();
		JButton b2 = new JButton();
		JButton b3 = b1;
		System.out.println(b1==b2);       //false
		System.out.println(b1==b3);       //true
		
		//"==" check the reference in following case.
		String s1 = "hello";
		String s2 = "hello";
		System.out.println(s1==s2);       //true
		
		String s3 = new String("java");
		String s4 = new String("java");
		System.out.println(s3==s4);       //false
		
		System.out.println(s3.equals(s4));         //equals() checks the values, for same values it gives true.
		
		
		}
}
