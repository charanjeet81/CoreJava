package others_14;

public class Casting
{
	
	static int a = (int)3.14;   // here also there is "loss of precision", but you did it explicitly.
	static byte b = 39;         // upto 127 is treated as byte, after that it is int. 39 +100 of byte will give you -117 
	static byte c = (byte)139;  // output will be from loop i.e. -126
	static long d1 = (long)3.14;     // can not convert from double to long
	static double d2 = 55555l;
	static float e = 3;
	static long l = 23l;
	
	public static void main(String[] args) 
	{
		System.out.println(a);
		System.out.println(b+100);
		System.out.println(c);
		System.out.println(d2);
		System.out.println(e);
		System.out.println(((Object)l).getClass().getName());
	}
}
