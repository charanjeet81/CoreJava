package others_14;

public class WrapperTest3 
{	
	static Integer i5;                     //referring to "null"                    
	public static void main(String[] args) 
	{
		Integer i1 = 100;
		Integer i2 = 100;
		System.out.println(i1==i2);        //true //upto 127 "==" also check values, it doesn't check reference, although both are different objects. 
		System.out.println(i1.equals(i2)); //true
		
		Integer i3 = 1000;
		Integer i4 = 1000;
		System.out.println(i3==i4);        //false //after 127 it checks reference, it doesn't check value 
		System.out.println(i3.equals(i4)); //true
		
		System.out.println(i5++);          //you are trying to increment "null", so "java.lang.NullPointerException"
	}
}
