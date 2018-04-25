package array_12;
// 2D array can't be refer to 1D array.

class Car{}
class i10 extends Car{}
class i20 extends Car{}


public class ArrayTest6 
{
	public static void main(String[] args) 
	{
		Car[] myCars = {new Car(), new i10(), new i20()}; //Any class and its Sub-class can be part of array.
		
		i10[] i = new i10[3];
		myCars = i; // Sub class array can be assigned to Super class array, but reverse is not true.
		//i = myCars;
		
		int[][] obj = {{2,3,4},{8,9},{3,4,5,6}}; // This line will generate four objects.
		System.out.println(obj[2][1]);
		
		

	}

}
