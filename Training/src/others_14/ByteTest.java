package others_14;

public class ByteTest {

	public static void main(String[] args) {
		byte a, b;
		a=b=4;          // int to byte
		System.out.println(a+b);
		a=(byte)(a+b);	//a=a+b; will show error.
		System.out.println(a);				
		a=b=4;
		a+=b;           //It will do auto-casting(int to byte).
		System.out.println(a);
		

	}

}
