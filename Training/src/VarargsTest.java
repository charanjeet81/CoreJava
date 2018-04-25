/* It makes the code more readable and easy.
 * Var-args stands for variable arguments.
 * It is used when no of argument for a method is not confirm.
 * It saves us from using overloaded methods for different arguments.
 * There cann't be two var-args per method like: void sum(float... f, int... i);
 * Var-args should be come in last like: void sum(float f, int... i);  
 */

public class VarargsTest 
{
	void sum(float f, int... n)
	{
		int sum = 0;
		for(int i : n)   //Enhanced-for loop ~OR~ foreach loop.
		{
			sum = sum + i;
		}
		System.out.println("Sum is = "+(sum+f));		
	}	
	
	public static void main(String[] args)
	{
		VarargsTest vt = new VarargsTest();
		vt.sum(2.3f, 3);
		vt.sum(2.3f, 6, 8);
		vt.sum(3.3f, new int[]{2,4,6,8});
	}
}