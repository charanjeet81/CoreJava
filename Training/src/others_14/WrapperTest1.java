package others_14;
//Wrapper Classes are introduced because of: 1. Wrapping primitive values in objects, so that it can be used in collection, 
//and return as a object.
//Each primitive type has its corresponding wrapper-class; like for int -> Integer likewise Byte, Character, Float. 

public class WrapperTest1 
{
	public static void main(String[] args) 
	{
		int i = 21;
		Integer i1 = new Integer(i);      //Boxing
		Integer i2 = new Integer("21");    //Boxing
		Integer in = 34;                   //Auto-Boxing
		
		int ii = i2;
		System.out.println("Auto-Unboxing: "+ii);
		
		Character ch = new Character('c'); //only accept character.
		
		int i3 = i1.intValue();  //xxxValue(); It returns primitive value.(unboxing)
		System.out.println(i3);
		
		int i4 = Integer.parseInt("81");  //parseXXX(); It returns primitive.
		
		Integer i5 = Integer.valueOf("79");    //valueOf() it returns object.
		Integer i6 = Integer.valueOf("1001", 2);
		System.out.println(i5);
		System.out.println(i6);
		System.out.println(i6 instanceof Integer);
	}
}
