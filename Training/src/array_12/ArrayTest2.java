// We can assign underlying classes to super-class-array.
package array_12;

public class ArrayTest2 
{
	public static void main(String[] args) 
	{
		Object[] ob = new Object[4];  //Object' reference is referring to Sub classes. 
		ob[0] = new String("Hello");
		ob[1] = new Integer(6);
		ob[2] = new Float(3.14f);
		ob[3] = new Thread();      //output ?
		
		for(int i=0; i<4; i++)
		{
			System.out.println(ob[i]);
		}
	}
}
