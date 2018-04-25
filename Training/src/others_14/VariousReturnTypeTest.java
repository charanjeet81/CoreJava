package others_14;

import java.awt.Button;

class DifferentRT
{
	String fxn0()        //String as a return type.
	{
		return "http://amazingjavablog.blogspot.in/";
	}
	Button fxn1()         //null as a return type.
	{
		return null;
	}
	
	String[] fxn2()       //String array as a return type.
	{
		return new String[]{"hello","hi","hey"};
	}
	int fxn3()             //int as a return type.
	{
		int c='A';
		return c;
	}
	int fxn4()             //casted-int as return type.
	{
		float pi=3.14f;
		return (int)pi;
	}
	void fxn5()             //return type is not required.
	{
		int a,b,s;
		a=b=4;
		s=a+b;              //before using local variable it must be initialised.
		System.out.println(s);
		//return "hello";   //void method can't return any value.
	}
	Animal fxn6()     //Class itself or its Sub-type can also be return type.
	{
		return new Horse();
	}
	Object fxn7()    //Object as a return type.
	{
		int[] num = {6,7,8,9};
		return num;
	}
	Horse fxn8()     // After typecast only we can return its super-class.
	{
		return (Horse)(new Animal());
	}
	
	//interface can also be return type.
}

public class VariousReturnTypeTest 
{
	public static void main(String[] args) 
	{
		

	}

}
