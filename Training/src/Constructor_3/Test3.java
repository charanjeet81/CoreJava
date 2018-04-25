package Constructor_3;

import java.util.Scanner;

class Studentt
{ 
	private int rollNO;
	private String name;
	private int age;
	
	Studentt(int rollNO, String name, int age)    //parameterised constructor.
	{
		this.rollNO=rollNO;
		this.name=name;
		this.age=age;
	}
	
    public void display()
	{
    	System.out.println("Student's name is - "+name+" age is - "+age+" and roll number is - "+rollNO);
	}
}

public class Test3 
{
	public static void main(String[] args)
	{
		int rollNum;
		String name;
		int age;
		int iteration = 0;
		int entries = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("How many entries you want to make:");
		entries = Integer.parseInt(sc.nextLine());
		Studentt[] stus = new Studentt[entries];
		
		do
		{
			System.out.println("Enter Roll Number: ");
			rollNum = Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter Name: ");
			name = sc.nextLine();
			
			System.out.println("Enter Age: ");
			age = Integer.parseInt(sc.nextLine());
			
			stus[iteration] = new Studentt(rollNum, name, age);
			iteration++;
		}while(entries!=iteration);
		
		// Displaying the Array.
		for (Studentt studentt : stus) 
		{
			studentt.display();
			System.out.println("============");
		}
		
	}
}
