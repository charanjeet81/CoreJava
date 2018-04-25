package string_15;

public class Test2 
{
	public static void main(String[] args) 
	{
		String s1 = "spring ";
		String s2 = s1 + "summer ";
		s1.concat("fall ");
		s2.concat(s1);
		s1 += "winter ";
		System.out.println(s1 + " " + s2);
	}
}
//count how many strings are eligible for gc()?

/*To make Java more memory efficient, the
JVM sets aside a special area of memory called the "String constant pool." When the
compiler encounters a String literal, it checks the pool to see if an identical String
already exists. If a match is found, the reference to the new literal is directed to the
existing String, and no new String literal object is created.*//*

Q. Why String class is final and immutable?
Ans. 1. If several reference variables refer to the same String
without even knowing it, it would be very bad if any of them could change the
String's value, so it is immutable.
2. Nobody can override the behaviors of any of the String methods, so its final.*/
