package array_12;

public class ArrayTest3 
{
	public static void main(String[] args)
	{
		int[][] twoD = new int[3][];   //int[][] twoD = {{2,4,6},{12,14},{22,44,66,88}};
		
		twoD[0] = new int[3];
		twoD[0][0]=2;
		twoD[0][1]=4;
		twoD[0][2]=6;
		
		twoD[1] = new int[2];
		twoD[1][0]=12;
		twoD[1][1]=14;
		
		twoD[2] = new int[4];
		twoD[2][0]=22;
		twoD[2][1]=44;
		twoD[2][2]=66;
		twoD[2][3]=88;
		
		System.out.println(twoD[2][0]);
	}
}
