package array_12;
//Arrays are itself object on heap, infact Array never hold actual object, it only holds object-reference variable.
//Array are object, that can have multiple variables of same type,
//Arrays can have primitive variables and object reference. 

public class ArrayTest1 
{	
	public static void main(String[] args)
	{
		int[] marks = new int[5]; 		        //Array-creation
		marks[0]=2;
		marks[1]=4;
		marks[2]=6;
		marks[3]=8;
		marks[4]=10;		
		for(int i=0;i<5;i++)                    //Array-printing
			System.out.println(marks[i]);
		
		int[] num = new int[]{12,14,16,18,20};  //Other way of Array-creation(Anonymous Array,new int[]{12,14,16,18,20};
		for (int j : num)                       //Other way of Array-printing
		{
			System.out.println(j); 
		}
		
		int[] no = {2,4,6,8,10};                //one more way of array creation.
		for(int i=0;i<5;i++)                    //Array-printing
			System.out.println(no[i]);
	}
}
