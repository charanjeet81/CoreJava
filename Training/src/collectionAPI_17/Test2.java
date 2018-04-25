package collectionAPI_17;
/*public class Test2 
{
	public static void main(String[] args)
	{
		Test2 t = new Test2();
		System.out.println(t);		
	}
}*/
 //collectionAPI_17.Test2@19821f
/*If you don't override toString() then it gives you the package name, class name 
followed by the @ symbol, followed by the unsigned hexadecimal representation of
the object's hashcode.*/

class BobTest 
{
	public static void main (String[] args) 
	{
		Bob f = new Bob("GoBobGo", 19);
	    System.out.println(f);  // System.out.println(f.toString());
    }
}
class Bob 
{
	int shoeSize;
	String nickName;
	Bob(String nickName, int shoeSize) 
	{
		this.shoeSize = shoeSize;
		this.nickName = nickName;
	}
	public String toString() 
	{
		return ("I am a Bob, nickname "+nickName+". My shoe size is " + shoeSize);
	}
}