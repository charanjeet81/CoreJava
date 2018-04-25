package array_12;

import java.util.Scanner;

class Student
{
	private int rollNo;
	private String name;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

public class ArrayTest5 
{
	public static void main(String[] args) 
	{
		Student[] stu = new Student[3];
		
		for(int i=0; i<stu.length; i++)
		{
			stu[i] = new Student();       //create objects by one line.
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Roll Number :");
			int r = sc.nextInt();
			stu[i].setRollNo(r);
			System.out.println("Enter Name :");
			String  n = sc.next();
			stu[i].setName(n);			
		}
		for(int i=0; i<stu.length; i++)
		{
			System.out.println(stu[i].getRollNo());
			System.out.println(stu[i].getName());
		}
	}
}
