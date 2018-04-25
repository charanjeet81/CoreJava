//Block Execution
/*
1. All static blocks at the time of class loading.
2. Only static block is not supported by java now, main method should be there along with.
*/

package BlocksExe_2;

public class Test1	{
	static
	{
		System.out.println("Printing without main()");
		System.exit(0);
	}

}
